package com.example.appaps;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appaps.entidades.Estudiante;

public class MainInicio extends AppCompatActivity {
    TextView email;
TextView nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        Intent intents = new Intent(getApplicationContext(), MainInicio.class);


        //email

        Intent intent = this.getIntent();

        Bundle extras=getIntent().getExtras();
        Estudiante estudiante = extras.getParcelable("estudiante");
        email=findViewById(R.id.CampoEmail);
        nombre=findViewById(R.id.IdCampoNombre);
        nombre.setText(estudiante.getNombre());
        email.setText(estudiante.getEmail());
        intents.putExtra("estudiantes",estudiante);


    }

    public void mainSubir(View view){
        Intent intentsubir= new Intent(MainInicio.this, SubirActivity.class);
        MainInicio.this.startActivity(intentsubir);

    }

    public void Listar(View view){
        Intent intentlistar=new Intent(MainInicio.this, ListaActivity.class);
        MainInicio.this.startActivity(intentlistar);
    }
}
