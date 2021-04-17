package com.example.appaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        ;
    }


        public void Siguiente(View view) {
            Intent intent =new Intent(PrincipalActivity.this, LoginCompany.class);
            startActivity(intent);

        }
    public void SigEstudiante(View view) {
        Intent i =new Intent(PrincipalActivity.this, LoginStudent.class);
        startActivity(i);

    }
    }

