package com.example.appaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.appaps.entidades.Estudiante;
import com.example.appaps.ui.ConexionHelper;
import com.example.appaps.ui.Utilidades;

public class LoginStudent extends AppCompatActivity {
    EditText usuario,password;
    Button boton;
    ConexionHelper conn;

    Estudiante estudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_student);
        usuario=(EditText)findViewById(R.id.User_Stud);
        password= (EditText)findViewById(R.id.Pass_Stud);
        boton= (Button)findViewById(R.id.btLoginStud);
        Estudiante est= new Estudiante();
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent per =new Intent(LoginStudent.this, MainInicio.class);
                startActivity(per);
               consultar();
               String valor=null;


            }
        });
        conn= new ConexionHelper(getApplicationContext(),"bd_app",null,1);
    }
    public void registroEst (View view ){
        Intent ree= new Intent(LoginStudent.this, Registro2Activity.class);
        startActivity(ree);
    }
    public void consultar(){
        String nombre;
        String apellido;
        String pass;
        String user;
        String id;
        String email;
        SQLiteDatabase db = conn.getReadableDatabase();
        String [] projection= {
                Utilidades.campo_password,
                Utilidades.campo_usuario,
                Utilidades.campo_email,
                Utilidades.campo_nombre,
                Utilidades.campo_id,
                Utilidades.campo_apellido
        };
        String select=Utilidades.campo_usuario+" = ?";
        String [] args= {usuario.getText().toString()};
        Cursor cursor= db.query(
                Utilidades.TABLA_ESTUDIANTE,
                projection,
                select,
                args,
                null,
                null,
                null

        );


        cursor.moveToFirst();
        nombre= cursor.getString(3);
        id= cursor.getString(4);
        pass= cursor.getString(0);
        email= cursor.getString(2);
        user= cursor.getString(1);
        apellido= cursor.getString(5);
        estudiante= new Estudiante();
        estudiante.setUsuario(user);
        estudiante.setId(id);
        estudiante.setEmail(email);
        estudiante.setNombre(nombre);
        estudiante.setPassword(pass);
        estudiante.setApellido(apellido);
       // Toast.makeText(this, id +" "+estudiante.getNombre()+" "+estudiante.getNombre()+" "+estudiante.getUsuario(),Toast.LENGTH_LONG).show();

        cursor.close();
        db.close();



        Intent intent = new Intent(getApplicationContext(), MainInicio.class);
        intent.putExtra("estudiante", estudiante);
        startActivity(intent);



    }




}

