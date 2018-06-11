#include "example_dokemonster_Segment.h"

JNIEXPORT jboolean JNICALL Java_example_dokemonster_Segment_SegmentControl
        (JNIEnv * env, jobject obj, jint data){
    int dev, ret;
    dev = open("dev/fpga_segment", O_RDWR | O_SYNC);

    if (dev != -1){
        ret = write(dev, &data, 4);
        close(dev);
    }else{
        return -1;
    }
    return 0;
}

JNIEXPORT jboolean JNICALL Java_example_dokemonster_Segment_SegmentIOControl
        (JNIEnv * env, jobject obj, jint data){
    int dev, ret;
    dev = open("dev/fpga_segment", O_RDWR | O_SYNC);
    if (dev != -1){
        ret = ioctl(dev, data, NULL, NULL);
        close(dev);
    }else{
        return -1;
    }
    return 0;

}
