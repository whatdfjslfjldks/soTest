package com.example.jni;

public class Demo {
    static {
        System.loadLibrary("hello");
    }
    public native String sayhello();
}
