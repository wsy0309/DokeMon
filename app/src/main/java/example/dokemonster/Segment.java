package example.dokemonster;

public class Segment {
    static{
        System.loadLibrary("segment");

    }

    public native boolean SegmentControl(int data);
    public native boolean SegmentIOControl(int data);

      public boolean UpdateValue(int data) {
            if(data < 0)
                data = 0;
            SegmentControl(data);
            return true;
      }

}
