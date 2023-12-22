#include "jni.h"
#include <string>

extern "C" JNIEXPORT jstring
Java_com_example_jni_Demo_sayhello(JNIEnv* env, jobject /* this */) {
std::string hello = "Hello from C++";
return env->NewStringUTF(hello.c_str());
}
