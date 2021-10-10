package com.javamaster.springmvc.model;

import java.util.ArrayList;

public class FacturaTienda implements Factura {
    private int id;
    private String fecha;
    private ArrayList<ProductoComprado> productoComprados;

    public FacturaTienda(int id, String fecha) {
        this.id = id;
        this.fecha = fecha;
        this.productoComprados = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public ArrayList<ProductoComprado> getProductoComprados() {
        return productoComprados;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setProductoComprados(ArrayList<ProductoComprado> productoComprados) {
        this.productoComprados = productoComprados;
    }

    @Override
    public void pago() {

    }
}
