package com.lorcanluo.llog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lorcanluo.llog.library.LLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LLog.init(this.getPackageName());

        LLog.d("MainActivity", "哎哟喂");
        LLog.e("MainActivity", "我都哇哦度哇哦对哇哦度哇哦度哇");
        LLog.i("MainActivity", "哎哟喂11111");
        LLog.d("MainActivity", "哎哟喂22222");
        LLog.w("MainActivity", "哎哟喂22222");
        LLog.w("MainActivity", "哎哟喂22222");
    }
}
