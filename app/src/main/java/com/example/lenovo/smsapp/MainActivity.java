package com.example.lenovo.smsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper helper=new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick(View a){
        if(a.getId()==R.id.sbutton){
            Intent i=new Intent(MainActivity.this,signup.class);
            startActivity(i);
        }
        if(a.getId()==R.id.lbutton){
            EditText a1=(EditText)findViewById(R.id.username);
            String user=a1.getText().toString();
            EditText a2=(EditText)findViewById(R.id.password);
            String pass=a2.getText().toString();

            String pwd=helper.searchPass(user);
            String str=helper.getColumnUsername(user);
            if(pwd.equals(pass)){

                Intent j= new Intent(MainActivity.this,menu.class);
                j.putExtra("nam",str);
                startActivity(j);
            }
            else {
                Toast temp=Toast.makeText(MainActivity.this,"Username and Password don't match",Toast.LENGTH_SHORT);
                temp.show();
            }
        }
    }
}

