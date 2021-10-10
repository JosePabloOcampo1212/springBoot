package com.javamaster.springmvc.model;

public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private int cantidadExistencias;

    public Producto(int id, String nombre, String descripcion, int cantidadExistencias) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidadExistencias = cantidadExistencias;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidadExistencias() {
        return cantidadExistencias;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidadExistencias(int cantidadExistencias) {
        this.cantidadExistencias = cantidadExistencias;
    }
}
