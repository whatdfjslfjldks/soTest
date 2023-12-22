package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.jni.Demo;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    // 加载包含本地方法的库
    static {
        System.loadLibrary("hello");
    }

    // 声明本地方法
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text=findViewById(R.id.text);
        Demo demo=new Demo();
        String result=demo.sayhello();
        text.setText(result);
    }


}