package com.javamaster.springmvc.model;

import javax.persistence.*;
import java.util.Set;

@Table(name = "cliente")
@Entity

public class Cliente extends Persona {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hospital_id", insertable=false, updatable=false)
	private Hospital hospital;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente", fetch = FetchType.EAGER)
	private Set<Mascota> mascotas;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente", fetch = FetchType.EAGER)
	private Set<FacturaTienda> facturasTiendas;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente", fetch = FetchType.EAGER)
	private Set<FacturaHospital> facturasHospital;

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Set<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(Set<Mascota> mascotas) {
		this.mascotas = mascotas;
	}

	public Set<FacturaTienda> getFacturasTiendas() {
		return facturasTiendas;
	}

	public void setFacturasTiendas(Set<FacturaTienda> facturasTiendas) {
		this.facturasTiendas = facturasTiendas;
	}

	public Set<FacturaHospital> getFacturasHospital() {
		return facturasHospital;
	}

	public void setFacturasHospital(Set<FacturaHospital> facturasHospital) {
		this.facturasHospital = facturasHospital;
	}
}
