package com.example.inicio;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.sql.Statement;

public class SubirActivity extends AppCompatActivity {

    private ImageView imapro;
    private EditText nombre_proyecto;
    private EditText descripcion_proyectos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subir);
        imapro=findViewById(R.id.improyecto);
        nombre_proyecto=findViewById(R.id.txtnombrepro);
        descripcion_proyectos=findViewById(R.id.txtdescrippro);

    }


    public void Subir(View view) {
        cargarimagen();
    }

    private void cargarimagen() {
        Intent intent= new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/");
        startActivityForResult(intent.createChooser(intent,"Seleccione la aplicacion,"),10);

        }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==RESULT_OK){
            Uri path=data.getData();
            imapro.setImageURI(path);
        }
    }
    public void subir(View view){
        AdminSQLiteOpenHeper admin = new AdminSQLiteOpenHeper(this,"administracion, ",null, 1);
        SQLiteDatabase BaseDeDatos =admin.getWritableDatabase();
        String nombreproyecto= nombre_proyecto.getText().toString();
        String descripproyejcto= descripcion_proyectos.getText().toString();


    }
}
