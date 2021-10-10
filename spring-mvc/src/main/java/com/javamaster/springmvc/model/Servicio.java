package com.javamaster.springmvc.model;

import java.util.ArrayList;

public class Servicio {
    private int id;
    private String fecha;
    private String descripcion;
    private Veterinario veterinario;
    private ArrayList<String> medicamentos_aplicados;

    public Servicio(int id, String fecha, String descripcion, Veterinario veterinario, ArrayList<String> medicamentos_aplicados) {
        this.id = id;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.veterinario = veterinario;
        this.medicamentos_aplicados = medicamentos_aplicados;
    }

    public int getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public ArrayList<String> getMedicamentos_aplicados() {
        return medicamentos_aplicados;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public void setMedicamentos_aplicados(ArrayList<String> medicamentos_aplicados) {
        this.medicamentos_aplicados = medicamentos_aplicados;
    }
}
