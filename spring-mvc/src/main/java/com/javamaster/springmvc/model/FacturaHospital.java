package com.javamaster.springmvc.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.Set;

@Table(name = "factura_hospital")
@Entity
@Data
public class FacturaHospital extends BaseEntity implements Factura {

	@Column(name = "fecha")
	@NotEmpty
	private Date fecha;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_id", insertable=false, updatable=false)
	private Cliente cliente;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "facturaHospital", fetch = FetchType.EAGER)
	private Set<Servicio> servicios;

	@Override
	public void facturar() {

	}

	// devulve las fecha
	public Date getFecha() {
		return fecha;
	}
// setea la fecha
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
// devuelve el cliente
	public Cliente getCliente() {
		return cliente;
	}
// setea el cliente
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
// devuelve los servicios
	public Set<Servicio> getServicios() {
		return servicios;
	}
// setea los servicios
	public void setServicios(Set<Servicio> servicios) {
		this.servicios = servicios;
	}
}
