package com.example.appaps.ui;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConexionHelper extends SQLiteOpenHelper {
    public ConexionHelper( Context context,  String name,  SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.Crear_Tabla_Usuario);
        db.execSQL(Utilidades.crearTablaProyecto);
        db.execSQL(Utilidades.crearTablaEmpresa);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS ESTUDIANTES");
        db.execSQL("DROP TABLE IF EXISTS PROYECTOS");
        db.execSQL("DROP TABLE IF EXISTS EMPRESA");


            onCreate(db);
    }
}
