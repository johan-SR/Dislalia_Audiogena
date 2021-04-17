package com.example.appaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.appaps.ui.ConexionHelper;
import com.example.appaps.ui.Utilidades;

import static com.example.appaps.ui.Utilidades.campo_email_empresa;
import static com.example.appaps.ui.Utilidades.campo_nit_Empresa;
import static com.example.appaps.ui.Utilidades.campo_nombre_Empresa;
import static com.example.appaps.ui.Utilidades.campo_password_empresa;

public class RegistroActivity extends AppCompatActivity {
    EditText campo_nombre,campo_Nit, campo_email,campo_password,campo_password2,campo_telefono;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        campo_nombre=(EditText)findViewById(R.id.IdNombreEmp);
        campo_Nit=(EditText)findViewById(R.id.IdNit);
        campo_email=(EditText)findViewById(R.id.IdCorreo);
        campo_password=(EditText)findViewById(R.id.IdPassw1);
        campo_password2=(EditText)findViewById(R.id.IdPassw2);
        campo_telefono=(EditText)findViewById(R.id.Numero);
        btn=(Button)findViewById(R.id.IdBotonRegistro);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrarEmpresa(); } });

    }
    public void registrarEmpresa(){
        ConexionHelper conn=new ConexionHelper(this,"bd_app",null,1);
        SQLiteDatabase db= conn.getWritableDatabase();
        ContentValues values= new ContentValues();
       values.put(campo_nombre_Empresa, campo_nombre.getText().toString());
       values.put(campo_nit_Empresa, campo_Nit.getText().toString());
       values.put(campo_email_empresa,campo_email.getText().toString());
       values.put(campo_password_empresa, campo_password.getText().toString());
       values.put(Utilidades.campo_telefono,campo_telefono.getText().toString());
        Long IdRes=db.insert(Utilidades.TABLA_Empresa,Utilidades.campo_id, values);
        Toast.makeText(getApplicationContext(),"id Registro:"+IdRes,Toast.LENGTH_LONG ).show();



        db.close();

    }

}
