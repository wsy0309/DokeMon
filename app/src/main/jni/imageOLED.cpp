#include "example_dokemonster_ImageOLED.h"

int fd = -1;

enum{
    OLED_INIT=0x10, MENU_PRINT, WIN_CLEAR, IMAGE_DRAW, RECT_DRAW, LINE_DRAW, CIRCLE_DRAW, TEXT_PRINT}IOCTL_CMD;

typedef struct{
    unsigned short sx;
    unsigned short sy;
    unsigned short ex;
    unsigned short ey;
}clearimage;

int OLEDClear(){
    if (fd < 0) fd = open("/dev/fpga_oled", O_WRONLY | O_NDELAY);
    if (fd < 0) return -errno;
    clearimage ci;
    ci.sx = (short) 0;
    ci.sy = (short) 0;
    ci.ex = (short) 127;
    ci.ey = (short) 127;
    int ret = ioctl(fd, WIN_CLEAR, &ci, sizeof(ci));
    if (ret > 0) return ret;
    return -1;
}

int OLEDImage(int *data){
    int ret;
    unsigned short buf[128*128];
    unsigned short r = 0, g = 0, b = 0;
    int temp;
    if (fd < 0) fd = open("/dev/fpga_oled", O_WRONLY | O_NDELAY);
    if (fd < 0) return -errno;
    for (int i = 0; i < 128*128; i++)
        buf[i] = 0xffff;
    if (fd >= 0){
        for (int i = 0; i < 128*128; i++){
            temp = data[i];
            b = (unsigned short)((temp & 0x000000FF) >> 3);
            g = (unsigned short)((temp & 0x0000FF00) >> 5);
            r = (unsigned short)((temp & 0x00FF0000) >> 8);
            buf[i] = ((r&0xf800) | (g&0x07e0) | (b&0x001f));
        }
        ret = write (fd, buf, 128*128*2);
    }else return fd;
    if (ret > 0) return ret;
    return -1;
}



JNIEXPORT jboolean JNICALL Java_example_dokemonster_ImageOLED_open
        (JNIEnv *env, jobject obj){
    fd = open("/dev/fpga_oled", O_WRONLY | O_NDELAY);
    if (fd < 0) return -errno;
    else return 1;

}

JNIEXPORT void JNICALL Java_example_dokemonster_ImageOLED_Control
(JNIEnv *env, jobject obj, jintArray image){
    int *data;
    data = (int*) (*env).GetIntArrayElements(image, 0);
    OLEDImage(data);
    (*env).ReleaseIntArrayElements(image, data, 0);
    close(fd);
}
