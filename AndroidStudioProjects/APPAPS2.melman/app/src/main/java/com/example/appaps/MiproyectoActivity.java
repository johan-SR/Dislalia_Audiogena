package com.example.appaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.appaps.R;

import org.w3c.dom.Text;

import java.lang.reflect.Array;

public class MiproyectoActivity extends AppCompatActivity {

   TextView nombre, descr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miproyecto);
        nombre=findViewById(R.id.txt_titulo_miproyecto);
        descr=findViewById(R.id.txt_descrip_miproyecto);

        //mostrar informacion proyecto
        Intent intent = this.getIntent();
        Bundle extra = intent.getExtras();
        String idpro1 = extra.getString("idpro");
        String descpro1 = extra.getString("descpro");
        nombre.setText(idpro1);
        descr.setText(descpro1);



    }

    public void compartir(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "Les comparto mi proyecto de emprendimiento " +nombre.getText());
        startActivity(Intent.createChooser(intent, "Compartir con"));
    }


}
