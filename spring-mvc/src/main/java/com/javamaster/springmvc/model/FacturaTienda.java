package com.javamaster.springmvc.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.Set;

@Table(name = "factura_tienda")
@Entity
public class FacturaTienda extends BaseEntity implements Factura {


	@Column(name = "fecha")
	@NotEmpty
	private Date fecha;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "facturaTienda", fetch = FetchType.EAGER)
	private Set<ProductoComprado> productoComprados;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	@Override
	public void facturar() {

	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Set<ProductoComprado> getProductoComprados() {
		return productoComprados;
	}

	public void setProductoComprados(Set<ProductoComprado> productoComprados) {
		this.productoComprados = productoComprados;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
