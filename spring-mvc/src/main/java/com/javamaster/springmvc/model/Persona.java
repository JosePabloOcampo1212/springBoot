package com.javamaster.springmvc.model;

import java.util.ArrayList;

public abstract class Persona {
    int cedula;
    String nombre;
    String apellido1;
    String apellido2;
    String direccion;
    ArrayList<String> telefonos;

    public Persona(int cedula, String nombre, String apellido1, String apellido2, String direccion, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.telefonos = new ArrayList<>();
        this.telefonos.add(telefono);
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<String> getTelefonos() {
        return telefonos;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = telefonos;
    }
}


