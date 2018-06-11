//
// Created by user on 2018-06-11.
//

#include "example_dokemonster_SimpleLED.h"

static int fd = -1;


JNIEXPORT jboolean JNICALL Java_SimpleLED_Open
        (JNIEnv *env, jobject obj) {
    fd = open("/dev/fpga_led", O_RDWR);
    if (fd < 0)
        return -errno;
    else
        return 1;
}

JNIEXPORT jboolean JNICALL Java_SimpleLED_TurnOn
        (JNIEnv *env, jobject obj, jint data) {
    if (fd < 0)
        fd = open("/dev/fpga_led", O_RDWR);
    if (fd < 0)
        return -errno;
    data &= 0xff;
    write(fd, &data, 4);
    return 1;
}

JNIEXPORT jboolean JNICALL Java_SimpleLED_TurnOffAll
        (JNIEnv *env, jobject obj){
    int data = 0x00;
    if (fd < 0)
        fd = open("/dev/fpga_led", O_RDWR);
    if (fd < 0)
        return -errno;
    write(fd, &data, 4);
    return 0;
}

JNIEXPORT jboolean JNICALL Java_SimpleLED_Close
        (JNIEnv *env, jobject obj) {
    if (fd < 0) return -errno;
    close(fd);
    fd = -1;
    return 1;
}

