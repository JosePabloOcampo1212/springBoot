package com.javamaster.springmvc.model;

public class Mascota {
    private int id;
    private Expediente expediente;
    private String tipo;
    private String nombre;
    private String fecha_nacimento;

    public Mascota(int id, Expediente expediente, String tipo, String nombre, String fecha_nacimento) {
        this.id = id;
        this.expediente = expediente;
        this.tipo = tipo;
        this.nombre = nombre;
        this.fecha_nacimento = fecha_nacimento;
    }

    public int getId() {
        return id;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha_nacimento() {
        return fecha_nacimento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha_nacimento(String fecha_nacimento) {
        this.fecha_nacimento = fecha_nacimento;
    }
}
