package com.javamaster.springmvc.model;

public class Masco {
    private int id;
    private String tipo;
    private String nombre;
    private String fechaNacimiento;

    public Masco(int id, String tipo, String nombre, String fechaNacimiento) {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
