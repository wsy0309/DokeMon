package example.dokemonster;

import android.util.Log;

public class SimpleLED{

    private int cnt = 0;
    static{
        System.loadLibrary("simpleLED");
    }

    public native boolean Open();
    public native boolean TurnOn(int stage);
    public native boolean TurnOffAll();

    SimpleLED(){
        //cnt = count;
        boolean ret = Open();
        if (!ret)
            Log.d("LED", "Open fail");
    }

    public int UpdateValue() {
        return 0;
    }

    public boolean UpdateValue(int count){
        if(count == 1 || count == 4 || count == 7)
            return TurnOn(0x07);
        else if(count == 2 || count == 5 || count == 8)
            return TurnOn(0x3f);
        else
            return TurnOn(0xff);
    }
}