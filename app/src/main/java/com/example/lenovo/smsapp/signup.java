package com.example.lenovo.smsapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by lenovo on 10/19/2016.
 */

public class signup extends Activity {

    DatabaseHelper helper=new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }

    public void onsclick(View a){
        if(a.getId()== R.id.subutton){
            EditText a1=(EditText)findViewById(R.id.name);
            EditText a2=(EditText)findViewById(R.id.email);
            EditText a3=(EditText)findViewById(R.id.user);
            EditText a4=(EditText)findViewById(R.id.pass1);
            EditText a5=(EditText)findViewById(R.id.pass2);

            String name=a1.getText().toString();
            String email=a2.getText().toString();
            String user=a3.getText().toString();
            String pas1=a4.getText().toString();
            String pas2=a5.getText().toString();

        if(!pas1.equals(pas2)){
            Toast b=Toast.makeText(signup.this,"Passwords don't match",Toast.LENGTH_SHORT);
            b.show();
        }
        else{
            Contact c=new Contact();
            c.setName(name);
            c.setEmail(email);
            c.setUser(user);
            c.setPassword(pas1);

            helper.insertContact(c);
            Toast d=Toast.makeText(signup.this,"Registered",Toast.LENGTH_SHORT);
            d.show();
        }
        }
    }
}
