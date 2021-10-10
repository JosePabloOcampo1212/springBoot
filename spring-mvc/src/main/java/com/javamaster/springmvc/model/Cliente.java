package com.javamaster.springmvc.model;

import java.util.ArrayList;

public class Cliente extends Persona{
    private ArrayList<Mascota> mascotas;
    private ArrayList<Factura> facturaTienda;
    private ArrayList<Factura> facturaHospital;


    public Cliente(int cedula, String nombre, String apellido1, String apellido2, String direccion, String telefono) {
        super(cedula, nombre, apellido1, apellido2, direccion, telefono);
        this.mascotas=new ArrayList<Mascota>();
        this.facturaTienda = new ArrayList<Factura>();
        this.facturaHospital = new ArrayList<Factura>();
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public ArrayList<Factura> getFacturas() {
        return facturaTienda;
    }

    public ArrayList<Factura> getFacturaTienda() {
        return facturaTienda;
    }

    public ArrayList<Factura> getFacturaHospital() {
        return facturaHospital;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void setFacturaTienda(ArrayList<Factura> facturaTienda) {
        this.facturaTienda = facturaTienda;
    }

    public void setFacturaHospital(ArrayList<Factura> facturaHospital) {
        this.facturaHospital = facturaHospital;
    }
}
