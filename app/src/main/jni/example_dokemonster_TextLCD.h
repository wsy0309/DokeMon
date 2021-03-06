/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
#include <errno.h>
#include <fcntl.h>
#include <unistd.h>
#include <string.h>
#include <sys/mman.h>
#include <termios.h>

/* Header for class example_dokemonster_TextLCD */

#ifndef _Included_example_dokemonster_TextLCD
#define _Included_example_dokemonster_TextLCD
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     example_dokemonster_TextLCD
 * Method:    open
 * Signature: ()Z
 */
JNIEXPORT jboolean JNICALL Java_example_dokemonster_TextLCD_open
  (JNIEnv *, jobject);

/*
 * Class:     example_dokemonster_TextLCD
 * Method:    control
 * Signature: (Ljava/lang/String;Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_example_dokemonster_TextLCD_control
  (JNIEnv *, jobject, jstring, jstring);

/*
 * Class:     example_dokemonster_TextLCD
 * Method:    clear
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_example_dokemonster_TextLCD_clear
  (JNIEnv *, jobject);

/*
 * Class:     example_dokemonster_TextLCD
 * Method:    IOCtlDisplay
 * Signature: (Z)I
 */
JNIEXPORT jint JNICALL Java_example_dokemonster_TextLCD_IOCtlDisplay
  (JNIEnv *, jobject, jboolean);

/*
 * Class:     example_dokemonster_TextLCD
 * Method:    IOCtlReturnHome
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_example_dokemonster_TextLCD_IOCtlReturnHome
  (JNIEnv *, jobject);

/*
 * Class:     example_dokemonster_TextLCD
 * Method:    IOCtlCursor
 * Signature: (Z)I
 */
JNIEXPORT jint JNICALL Java_example_dokemonster_TextLCD_IOCtlCursor
  (JNIEnv *, jobject, jboolean);

/*
 * Class:     example_dokemonster_TextLCD
 * Method:    IOCtlBlink
 * Signature: (Z)I
 */
JNIEXPORT jint JNICALL Java_example_dokemonster_TextLCD_IOCtlBlink
  (JNIEnv *, jobject, jboolean);

#ifdef __cplusplus
}
#endif
#endif
