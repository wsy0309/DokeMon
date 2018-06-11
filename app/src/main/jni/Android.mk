LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := simpleLED
LOCAL_SRC_FILES := simpleLED.cpp
LOCAL_LDLIBS := -llog

include $(BUILD_SHARED_LIBRARY)

