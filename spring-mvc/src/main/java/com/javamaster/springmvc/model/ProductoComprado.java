package com.javamaster.springmvc.model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Table(name = "producto_comprado")
@Entity
public class ProductoComprado extends BaseEntity {

	@Column(name = "fecha")
	@NotEmpty
	private Date fecha;

	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="producto_id")
	private Producto producto;

	@Column(name = "cantidad")
	@NotEmpty
	private int cantidad;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "servicio_id")
	private Servicio servicio;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "factura_tienda_id")
	private  FacturaTienda facturaTienda;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "expediente_id")
	private Expediente expediente;

	public Date getFecha() {
		return fecha;
	}

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
