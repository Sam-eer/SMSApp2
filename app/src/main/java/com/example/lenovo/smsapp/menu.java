package com.example.lenovo.smsapp;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

public class menu extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},1);
        String n=getIntent().getStringExtra("nam");
        TextView a=(TextView)findViewById(R.id.name);
        a.setText(n);
    }

    public void inb(View view) {
        //ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},1);
        Intent intent = new Intent(menu.this, rec.class);
        startActivity(intent);
    }

    public void com(View view) {
        //ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},1);
        Intent intent = new Intent(menu.this, send.class);
        startActivity(intent);
    }

}

