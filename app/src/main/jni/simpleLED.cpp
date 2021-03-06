#include "example_dokemonster_SimpleLED.h"

static int fd = -1;

JNIEXPORT jboolean JNICALL Java_example_dokemonster_SimpleLED_Open
        (JNIEnv *env, jobject obj) {
    fd = open("/dev/fpga_led", O_RDWR);
    if (fd < 0)
        return -errno;
    else
        return 1;
}

JNIEXPORT jboolean JNICALL Java_example_dokemonster_SimpleLED_TurnOn
        (JNIEnv *env, jobject obj, jint data) {
    if (fd < 0)
        fd = open("/dev/fpga_led", O_RDWR);
    if (fd < 0)
        return -errno;
    data &= 0xff;
    write(fd, &data, 4);
    close(fd);
    return 1;
}

JNIEXPORT jboolean JNICALL Java_example_dokemonster_SimpleLED_TurnOffAll
        (JNIEnv *env, jobject obj){
    int data = 0x00;
    if (fd < 0)
        fd = open("/dev/fpga_led", O_RDWR);
    if (fd < 0)
        return -errno;
    write(fd, &data, 4);
    close(fd);
    return 0;
}

