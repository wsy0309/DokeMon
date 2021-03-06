LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := simpleLED
LOCAL_SRC_FILES := simpleLED.cpp
LOCAL_LDLIBS += -llog
LOCAL_LDLIBS += $(LIB_PATH) -lsimpleLED
LOCAL_SHARE_LIBRARIES := libsimpleLED

include $(BUILD_SHARED_LIBRARY)

include $(CLEAR_VARS)

LOCAL_MODULE    := textLCD
LOCAL_SRC_FILES := textLCD.cpp
LOCAL_LDLIBS := -llog
LOCAL_LDLIBS += $(LIB_PATH) -ltextLCD
LOCAL_SHARE_LIBRARIES := libtextLCD

include $(BUILD_SHARED_LIBRARY)


include $(CLEAR_VARS)

LOCAL_MODULE    := imageOLED
LOCAL_SRC_FILES := imageOLED.cpp
LOCAL_LDLIBS := -llog
LOCAL_LDLIBS += $(LIB_PATH) -limageOLED
LOCAL_SHARE_LIBRARIES := libimageOLED


include $(BUILD_SHARED_LIBRARY)


include $(CLEAR_VARS)

LOCAL_MODULE    := segment
LOCAL_SRC_FILES := segment.cpp
LOCAL_LDLIBS := -llog
LOCAL_LDLIBS += $(LIB_PATH) -lsegment
LOCAL_SHARE_LIBRARIES := libsegment


include $(BUILD_SHARED_LIBRARY)
