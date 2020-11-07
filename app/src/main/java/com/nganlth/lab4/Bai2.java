package com.nganlth.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.Toast;

public class Bai2 extends AppCompatActivity {
    ConnectivityManager connectivityManager;
    NetworkInfo myWifi, my3G;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
            connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
//For 3G check
        boolean is3g = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE)
                .isConnectedOrConnecting();
//For WiFi Check
        boolean isWifi = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI)
                .isConnectedOrConnecting();
        if (is3g){
            Toast.makeText(this, "Thiết bị đã kết nối 3G", Toast.LENGTH_SHORT).show();
        }else if(isWifi){
            Toast.makeText(this, "Thiết bị đã kết nối Wifi", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(),"Hãy đảm bảo rằng Kết nối mạng của bạn đang BẬT ",Toast.LENGTH_LONG).show();
        }

    }

}