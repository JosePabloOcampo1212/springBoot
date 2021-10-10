package com.javamaster.springmvc.model;

import javax.persistence.*;
import java.util.Set;

@Table(name = "expediente")
@Entity
public class Expediente extends BaseEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mascota_id")
	private Mascota mascota;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "expediente", fetch = FetchType.EAGER)
	private Set<Servicio> servicios;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "expediente", fetch = FetchType.EAGER)
	private Set<ProductoComprado> productoComprados;

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public Set<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(Set<Servicio> servicios) {
		this.servicios = servicios;
	}

	public Set<ProductoComprado> getProductoComprados() {
		return productoComprados;
	}

	public void setProductoComprados(Set<ProductoComprado> productoComprados) {
		this.productoComprados = productoComprados;
	}
}

