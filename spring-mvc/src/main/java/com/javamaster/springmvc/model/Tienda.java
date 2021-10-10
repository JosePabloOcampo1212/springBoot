package com.javamaster.springmvc.model;



import javax.persistence.*;
import java.util.Set;

@Table(name = "tienda")
@Entity

public class Tienda extends BaseEntity {
	@OneToOne(fetch= FetchType.LAZY, mappedBy="tienda")
	private Hospital hospital;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tienda", fetch = FetchType.EAGER)
	private Set<Producto> productos;

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Set<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}
}
