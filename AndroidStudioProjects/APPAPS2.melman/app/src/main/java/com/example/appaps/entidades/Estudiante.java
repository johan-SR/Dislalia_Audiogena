package com.example.appaps.entidades;

import android.os.Parcel;
import android.os.Parcelable;

public class Estudiante implements Parcelable {
    private String id;
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private String Usuario;

    public Estudiante(String id, String nombre, String apellido, String email, String password, String usuario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.Usuario = usuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public Estudiante() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    protected Estudiante(Parcel in) {
        id = in.readString();
        nombre = in.readString();
        apellido = in.readString();
        email = in.readString();
        password = in.readString();
        Usuario = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(nombre);
        dest.writeString(apellido);
        dest.writeString(email);
        dest.writeString(password);
        dest.writeString(Usuario);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Estudiante> CREATOR = new Parcelable.Creator<Estudiante>() {
        @Override
        public Estudiante createFromParcel(Parcel in) {
            return new Estudiante(in);
        }

        @Override
        public Estudiante[] newArray(int size) {
            return new Estudiante[size];
        }
    };
}