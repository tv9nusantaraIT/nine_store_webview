package com.didinstudio.blog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class splashscreen extends Activity {
    //set waktu lama sPlashscreen
    private static int LamaTampilSplash = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //MULAI KODING
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // KODING
        setContentView(R.layout.splashcreen);
        //KODING LAGI
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // to do auto generated stub
                Intent apasih = new Intent(splashscreen.this, com.didinstudio.blog.MainActivity.class);
                startActivity(apasih);
                // jeda setelah splashscren
                this.selesai();
            }
            private void selesai(){
               //auto
            }
       },LamaTampilSplash);
    };
}
