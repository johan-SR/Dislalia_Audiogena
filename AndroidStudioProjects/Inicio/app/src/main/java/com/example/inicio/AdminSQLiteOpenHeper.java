package com.example.inicio;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminSQLiteOpenHeper extends SQLiteOpenHelper  {


    public AdminSQLiteOpenHeper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase BaseDeDatos) {

        BaseDeDatos.execSQL("create table estudiante(codigo int primary key, nombre text, apellido text, usuario text, password text, correo text, telefono int )");
        BaseDeDatos.execSQL("create table proyectos(idproyecto int primary key, nombre_proyecto text, descrip_pro Multilinetext," +
                " foreign key(id_proyecto_estudiante) references estudiante(codigo))");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
