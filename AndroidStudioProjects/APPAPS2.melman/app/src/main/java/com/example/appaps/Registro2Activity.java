package com.example.appaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.appaps.entidades.Estudiante;
import com.example.appaps.ui.ConexionHelper;
import com.example.appaps.ui.Utilidades;

public class Registro2Activity extends AppCompatActivity {
    EditText campo_nombre,campo_apellido, campo_usuario,campo_email,campo_password,campo_password2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro2);
        campo_nombre = (EditText) findViewById(R.id.IdNombreEst);
        campo_apellido = (EditText) findViewById(R.id.IdApellidos);
        campo_usuario = (EditText) findViewById(R.id.IdUsuario);
        campo_email = (EditText) findViewById(R.id.IdEmailEst);
        campo_password = (EditText) findViewById(R.id.IdPasswordEs);
        campo_password2 = (EditText) findViewById(R.id.IdPassword2Est);
        btn = (Button) findViewById(R.id.IdBotonCrearEst);
        btn.setOnClickListener(new View.OnClickListener() {            @Override
                               public void onClick(View v) {
                                   String email=campo_email.getText().toString();
                                   String pass1=campo_password.getText().toString();
                                   String pass2=campo_password2.getText().toString();


                                   if(pass1.equals(pass2)&&email.contains("@")) registrarEstudiantes();
                                   else if(!campo_password2.equals(campo_password)&&email.contains("@")&&campo_password.getText().toString().length()>7) {
                                       Toast.makeText(getApplicationContext(), "Las claves no coinciden:", Toast.LENGTH_LONG).show();
                                   } else  Toast.makeText(getApplicationContext(), "Email invalido", Toast.LENGTH_LONG).show();
                               }


                               }
        );

    }
    private void registrarEstudiantes() {
        ConexionHelper conn=new ConexionHelper(this,"bd_app",null,1);
        SQLiteDatabase db= conn.getWritableDatabase();
        ContentValues values= new ContentValues();



        values.put(Utilidades.campo_nombre,campo_nombre.getText().toString());
        values.put(Utilidades.campo_apellido,campo_apellido.getText().toString());
        values.put(Utilidades.campo_usuario,campo_usuario.getText().toString());
        values.put(Utilidades.campo_email, campo_email.getText().toString());
        values.put(Utilidades.campo_password,campo_password.getText().toString());
        Long IdRes=db.insert(Utilidades.TABLA_ESTUDIANTE,Utilidades.campo_id, values);
        Toast.makeText(getApplicationContext(),"id Registro:"+IdRes,Toast.LENGTH_LONG ).show();



        db.close();
        campo_apellido.setText("");
        campo_email.setText("");
        campo_nombre.setText("");
        campo_password.setText("");
        campo_usuario.setText("");
        campo_password2.setText("");



    }


}