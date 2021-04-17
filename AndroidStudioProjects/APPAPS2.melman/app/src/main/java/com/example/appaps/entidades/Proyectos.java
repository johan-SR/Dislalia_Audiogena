package com.example.appaps.entidades;

public class Proyectos {

    private Integer id;
    private String nombre, descripcion, id_estudiante;

    public Proyectos(Integer id, String nombre, String descripcion, String id_estudiante) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id_estudiante = id_estudiante;
    }
    public Proyectos(){}


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(String id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
