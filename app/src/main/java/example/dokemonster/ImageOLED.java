package example.dokemonster;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

public class ImageOLED{
    static{
        System.loadLibrary("imageOLED");
    }
    public native boolean open();
    public native void Control(int[] image);

    private Context context;

    private Bitmap bm;

    ImageOLED(Context ctx) {
        context = ctx;
        boolean ret = open();
        if (!ret)
            Log.d("OLED", "Open fail");
    }


    public boolean UpdateValue(int count) {

        java.io.InputStream stage1 = context.getResources().openRawResource(R.raw.stage1_img);
        java.io.InputStream stage2 = context.getResources().openRawResource(R.raw.stage2_img);
        java.io.InputStream stage3 = context.getResources().openRawResource(R.raw.stage3_img);

        switch (count) {
            case 1:
                bm = BitmapFactory.decodeStream(stage1);
                break;
            case 4:
                bm = BitmapFactory.decodeStream(stage2);
                break;
            case 7:
                bm = BitmapFactory.decodeStream(stage3);
                break;
        }

        int width = bm.getWidth();
        int height = bm.getHeight();
        int[] pixels = new int[width * height];
        bm.getPixels(pixels, 0, width, 0, 0, width, height);
        Control(pixels);
        return true;
    }

}
