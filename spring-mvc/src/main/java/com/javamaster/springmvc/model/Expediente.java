package com.javamaster.springmvc.model;

import java.util.ArrayList;

public class Expediente {
    private int id;
    private ArrayList<Servicio> servicios;
    private ArrayList<ProductoComprado> productoComprado;

    public Expediente(int id, ArrayList<Servicio> servicios, ArrayList<ProductoComprado> productoComprado) {
        this.id = id;
        this.servicios = servicios;
        this.productoComprado = productoComprado;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public ArrayList<ProductoComprado> getProductoComprado() {
        return productoComprado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }

    public void setProductoComprados(ArrayList<ProductoComprado> productoComprado) {
        this.productoComprado = productoComprado;
    }
}
