package com.javamaster.springmvc.model;

import java.util.ArrayList;

public class FacturaHospital implements Factura{
    private int id;
    private int idHospital;
    private String fecha;
    private ArrayList<ProductoComprado> productoComprados;
    private ArrayList<Servicio> servicios;

    public FacturaHospital(int id, int idHospital, String fecha) {
        this.id = id;
        this.idHospital = idHospital;
        this.fecha = fecha;
        this.productoComprados = new ArrayList<>();
        this.servicios = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public int getIdHospital() {
        return idHospital;
    }

    public String getFecha() {
        return fecha;
    }

    public ArrayList<ProductoComprado> getProductoComprados() {
        return productoComprados;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setProductoComprados(ArrayList<ProductoComprado> productoComprados) {
        this.productoComprados = productoComprados;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }

    @Override
    public void pago() {

    }
}
