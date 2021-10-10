package com.javamaster.springmvc.model;

public class ProductoComprado {
    private int id;
    private String fecha;
    private Producto producto;
    private int cantidad;

    public ProductoComprado(int id, String fecha, Producto producto, int cantidad) {
        this.id = id;
        this.fecha = fecha;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
