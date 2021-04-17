package com.example.inicio;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainInicio extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void Subir(View view){
        Intent intentsubir= new Intent(MainInicio.this, SubirActivity.class);
        MainInicio.this.startActivity(intentsubir);
    }

}
