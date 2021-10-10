package com.javamaster.springmvc.model;

import java.util.ArrayList;

public class Hospital {
    private int id;
    private Tienda tienda;
    private ArrayList<Cliente> cliesntes;
    private ArrayList<Veterinario> veterinarios;

    public Hospital(int id, Tienda tienda, ArrayList<Cliente> cliesntes, ArrayList<Veterinario> veterinarios) {
        this.id = id;
        this.tienda = tienda;
        this.cliesntes = cliesntes;
        this.veterinarios = veterinarios;
    }

    public int getId() {
        return id;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public ArrayList<Cliente> getCliesntes() {
        return cliesntes;
    }

    public ArrayList<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public void setCliesntes(ArrayList<Cliente> cliesntes) {
        this.cliesntes = cliesntes;
    }

    public void setVeterinarios(ArrayList<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }


}
