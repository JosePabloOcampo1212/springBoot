package com.javamaster.springmvc.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Table(name = "expediente")
@Entity
@Data
public class Expediente extends BaseEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mascota_id", insertable=false, updatable=false)
	private Mascota mascota;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "expediente", fetch = FetchType.EAGER)
	private Set<Servicio> servicios;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "expediente", fetch = FetchType.EAGER)
	private Set<ProductoComprado> productoComprados;

	public Mascota getMascota() {
		return mascota;
	} // devulve la mascota

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	} // set mascota

	public Set<Servicio> getServicios() {
		return servicios;
	} // devuelve los servicios

	public void setServicios(Set<Servicio> servicios) {
		this.servicios = servicios;
	} // setea los servicios

	public Set<ProductoComprado> getProductoComprados() {
		return productoComprados;
	}  // devulve los productos comprados

	public void setProductoComprados(Set<ProductoComprado> productoComprados) {
		this.productoComprados = productoComprados;
	}
}

