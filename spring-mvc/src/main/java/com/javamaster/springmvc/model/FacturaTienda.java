package com.javamaster.springmvc.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.Set;

@Table(name = "factura_tienda")
@Entity
@Data
public class FacturaTienda extends BaseEntity implements Factura {


	@Column(name = "fecha")
	@NotEmpty
	private Date fecha;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "facturaTienda", fetch = FetchType.EAGER)
	private Set<ProductoComprado> productoComprados;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_id", insertable=false, updatable=false)
	private Cliente cliente;

	@Override
	public void facturar() {

	}

	// devuelve la fecha
	public Date getFecha() {
		return fecha;
	}
// setea las fechas
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
// devuelve el producto comprado
	public Set<ProductoComprado> getProductoComprados() {
		return productoComprados;
	}
// setea el producto comprado
	public void setProductoComprados(Set<ProductoComprado> productoComprados) {
		this.productoComprados = productoComprados;
	}
// Devuelve el cliente
	public Cliente getCliente() {
		return cliente;
	}
// setea el cliente
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
