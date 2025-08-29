#include <jni.h>

extern "C"
JNIEXPORT jint JNICALL
Java_ndk_sample_ndk_1util_MathNdkLib_add(JNIEnv *env, jobject thiz, jint a, jint b) {
    return a + b;
}
extern "C"
JNIEXPORT jint JNICALL
Java_ndk_sample_ndk_1util_MathNdkLib_subtract(JNIEnv *env, jobject thiz, jint a, jint b) {
    return a - b;
}
extern "C"
JNIEXPORT jint JNICALL
Java_ndk_sample_ndk_1util_MathNdkLib_multiply(JNIEnv *env, jobject thiz, jint a, jint b) {
    return a * b;
}
extern "C"
JNIEXPORT jdouble JNICALL
Java_ndk_sample_ndk_1util_MathNdkLib_divide(JNIEnv *env, jobject thiz, jint a, jint b) {
    return (double) a / b;
}