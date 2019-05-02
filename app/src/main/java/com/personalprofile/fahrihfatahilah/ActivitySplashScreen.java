package com.personalprofile.fahrihfatahilah;
/*Nama : Fahrih Fatailah
NIM  : 10116405
KELAS : AKB-IF9
Tanggal Pengerjaan : 02 Mei 2019*/
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivitySplashScreen extends AppCompatActivity {
    private int waktu_loading=4000;

    //4000=4 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent home=new Intent(ActivitySplashScreen.this, WelcomeActivity.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);
    }
}