package com.javamaster.springmvc.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.Set;

@Table(name = "factura_hospital")
@Entity
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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(Set<Servicio> servicios) {
		this.servicios = servicios;
	}
}
