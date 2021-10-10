package com.javamaster.springmvc.model;

import java.util.ArrayList;

public class Veterinario extends Persona{
    private int id;
    private ArrayList<Especialidad> especialidades;
    private Horario horario;

    public Veterinario(int id, int cedula, String nombre, String apellido1, String apellido2, String direccion, String telefono, Horario horario) {
        super(cedula, nombre, apellido1, apellido2, direccion, telefono);
        this.id = id;
        this.especialidades = new ArrayList<Especialidad>();
        this.horario = horario;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEspecialidades(ArrayList<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}
