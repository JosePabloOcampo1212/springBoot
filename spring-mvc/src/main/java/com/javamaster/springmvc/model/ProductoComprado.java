package com.javamaster.springmvc.model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Table(name = "producto_comprado")
@Entity
@Data
public class ProductoComprado extends BaseEntity {

	@Column(name = "fecha")
	@NotEmpty
	private Date fecha;

	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="producto_id", insertable=false, updatable=false)
	private Producto producto;

	@Column(name = "cantidad")
	@NotEmpty
	private int cantidad;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "servicio_id", insertable=false, updatable=false)
	private Servicio servicio;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "factura_tienda_id", insertable=false, updatable=false)
	private  FacturaTienda facturaTienda;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "expediente_id", insertable=false, updatable=false)
	private Expediente expediente;

	public Date getFecha() {
		return fecha;
	}

	// geteer y setter de los productos comprados

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public FacturaTienda getFacturaTienda() {
		return facturaTienda;
	}

	public void setFacturaTienda(FacturaTienda facturaTienda) {
		this.facturaTienda = facturaTienda;
	}

	public Expediente getExpediente() {
		return expediente;
	}

	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}
}
