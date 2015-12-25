package com.github.lorcanluo.logfile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogHtml.init(this.getPackageName());

        LogHtml.d("MainActivity", "哎哟喂");
        LogHtml.e("MainActivity", "我都哇哦度哇哦对哇哦度哇哦度哇");
        LogHtml.i("MainActivity", "哎哟喂11111");
        LogHtml.d("MainActivity", "哎哟喂22222");
    }
}
