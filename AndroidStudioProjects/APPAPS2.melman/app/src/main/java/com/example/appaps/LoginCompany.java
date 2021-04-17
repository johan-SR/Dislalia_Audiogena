package com.example.appaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginCompany extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_company);
    }
    public void registro(View view){
        Intent re=new Intent(LoginCompany.this, RegistroActivity.class);
        startActivity(re);



    }
}
