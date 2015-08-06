#include<string.h>
#include<jni.h>


JNIEXPORT jstring JNICALL Java_com_zys_ndkdemo_MainActivity_native_1Get_1String
  (JNIEnv *env, jobject obj) {
	  return (*env)->NewStringUTF(env, "heihei");
  }