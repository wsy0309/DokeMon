package example.dokemonster;

import android.util.Log;
public class TextLCD{

    static{
        System.loadLibrary("textLCD");

    }

    public native boolean open();
    public native int control(String str, String str2);
    public native int clear();
    public native int IOCtlDisplay (boolean data);
    public native int IOCtlReturnHome ();
    public native int IOCtlCursor(boolean data);
    public native int IOCtlBlink(boolean data);

    public TextLCD(){
        boolean ret = open();
        if (!ret)
            Log.d("TextLCD", "Open fail");
        clear();
        IOCtlReturnHome();
        IOCtlDisplay(true);
        IOCtlCursor(false);
        IOCtlBlink(false);
    }

    void UpdateValue(int count){
        clear();

       switch (count){
           case 1:
               control("    Doke'Mon", "  stage 1 - 1");
               break;
           case 2:
               control("    Doke'Mon", "  stage 1 - 2");
               break;
           case 3:
               control("    Doke'Mon", "  stage 1 - 3");
               break;
           case 4:
               control("    Doke'Mon", "  stage 2 - 1");
               break;
           case 5:
               control("    Doke'Mon", "  stage 2 - 2");
               break;
           case 6:
               control("    Doke'Mon", "  stage 2 - 3");
               break;
           case 7:
               control("    Doke'Mon", "  stage 3 - 1");
               break;
           case 8:
               control("    Doke'Mon", "  stage 3 - 2");
               break;
           case 9:
               control("    Doke'Mon", "  stage 3 - 3");
               break;
       }
    }
}
