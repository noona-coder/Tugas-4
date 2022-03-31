package com.nurfazilla.flip;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class transaksi extends AppCompatActivity {

    protected void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.transaksi);
    }

    public void clickberanda(View view) {
        Intent i = new Intent(this,beranda.class);
        startActivity(i);
    }

    public void clicktransaksi(View view) {
        Intent i = new Intent(this,transaksi.class);
        startActivity(i);
    }

    public void clickbantuan(View view) {
        Intent i = new Intent(this,bantuan.class);
        startActivity(i);
    }

    public void clickakun(View view) {
        Intent i = new Intent(this,akun.class);
        startActivity(i);
    }
}
