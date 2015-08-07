#include<string.h>
#include<jni.h>

JNIEXPORT jstring JNICALL Java_com_zys_ndkdemo_MainActivity_native_1Get_1String(
		JNIEnv *env, jobject obj) {

	int a = 1;
	int b = 2;
	int c = 3;
	return (*env)->NewStringUTF(env, "heihei");
}
