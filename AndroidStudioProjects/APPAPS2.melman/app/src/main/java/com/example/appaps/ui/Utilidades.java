package com.example.appaps.ui;

public class Utilidades {

    //Atributos estudiante
    public static final String TABLA_ESTUDIANTE="ESTUDIANTES";
    public static final String campo_id="ID";
    public static final String campo_nombre="NOMBRE";
    public static final String campo_apellido="APELLIDO";
    public static final String campo_usuario="USUARIO";
    public static final String campo_email="EMAIL";
    public static final String campo_password="PASSWORD";
    public static final String Crear_Tabla_Usuario="CREATE TABLE "+" "+TABLA_ESTUDIANTE+" ("+
            campo_id+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
            campo_nombre+" TEXT, "+
            campo_apellido+" TEXT, "+
            campo_usuario+" TEXT, "+
            campo_email+" TEXT,"+
            campo_password+" TEXT )";
    //atributos proyecto
    public static final String tablaProyecto="PROYECTOS";
    public static final String campoIdProyecto="ID";
    public static final String campoNombreProyecto="NOMBRE";
    public static final String campoDescripcion="descripcion";
    public static final String campoIdProyectoEstudiante="ID_Estudiante";
    public static final String crearTablaProyecto="CREATE TABLE "+" "+tablaProyecto+" ("+
            campoIdProyecto+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
            campoNombreProyecto+" TEXT, "+
            campoDescripcion+ " TEXT, "+
            campoIdProyectoEstudiante+" INTEGER )";
    //atributos empresa
    public static final String TABLA_Empresa="EMPRESA";
    public static final String campo_id_empresa="ID";
    public static final String campo_nombre_Empresa="NOMBRE";
    public static final String campo_nit_Empresa="NIT";
    public static final String campo_password_empresa="PASSWORD";
    public static final String campo_telefono="TELEFONO";
    public static final String campo_email_empresa="EMAIL";
    public static final String crearTablaEmpresa="CREATE TABLE "+" "+TABLA_Empresa+" ("+
            campo_id_empresa+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
            campo_id_empresa+" TEXT, "+
            campo_password_empresa+ " TEXT, "+
            campo_telefono+" INTEGER, "+
            campo_email_empresa+ " TEXT )";

}
