package com.example.appaps;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.appaps.R;
import com.example.appaps.entidades.Estudiante;
import com.example.appaps.ui.ConexionHelper;
import com.example.appaps.ui.Utilidades;

public class SubirActivity extends AppCompatActivity {

    private ImageView imapro;
    EditText campoTitulo , campoDescripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ConexionHelper conn=new ConexionHelper(this,"bd_estudiantes",null,1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subir);
        imapro=findViewById(R.id.improyecto);
        campoTitulo =(EditText) findViewById(R.id.Id_tittle);
        campoDescripcion= (EditText)findViewById(R.id.Id_descri);

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
    public void crearProyecto(View view)
    {
        ConexionHelper conn=new ConexionHelper(this,"bd_app",null,1);
        SQLiteDatabase db= conn.getWritableDatabase();
        ContentValues values= new ContentValues();
        Bundle extras=getIntent().getExtras();
      /*  Estudiante estudiante = extras.getParcelable("estudiante");
        values.put(Utilidades.campoIdProyectoEstudiante,estudiante.getId());*/
values.put(Utilidades.campoNombreProyecto, campoTitulo.getText().toString());
values.put(Utilidades.campoDescripcion, campoDescripcion.getText().toString());
        Long IdRes=db.insert(Utilidades.tablaProyecto,Utilidades.campoIdProyecto, values);
        Toast.makeText(getApplicationContext(),"id Registro:"+IdRes,Toast.LENGTH_LONG ).show();



    }

}
