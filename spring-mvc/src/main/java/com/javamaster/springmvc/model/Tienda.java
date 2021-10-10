package com.javamaster.springmvc.model;

import java.util.ArrayList;

public class Tienda {
    private int id;
    private ArrayList<Producto> productos;

    public Tienda(int id, ArrayList<Producto> productos) {
        this.id = id;
        this.productos = productos;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
