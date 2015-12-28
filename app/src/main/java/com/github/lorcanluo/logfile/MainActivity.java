package com.github.lorcanluo.logfile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogLocal.init(this.getPackageName());

        LogLocal.d("MainActivity", "哎哟喂");
        LogLocal.e("MainActivity", "我都哇哦度哇哦对哇哦度哇哦度哇");
        LogLocal.i("MainActivity", "哎哟喂11111");
        LogLocal.d("MainActivity", "哎哟喂22222");
    }
}
