package com.javamaster.springmvc.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Table(name = "cliente")
@Entity
@Data
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
	} //get del atributo hospital

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	} //set de hospital

	public Set<Mascota> getMascotas() {
		return mascotas;
	}// set de mascota

	public void setMascotas(Set<Mascota> mascotas) {
		this.mascotas = mascotas;
	} // set de la lista de mascotas

	public Set<FacturaTienda> getFacturasTiendas() {  // ge de las fACTURAS DE una tienda
		return facturasTiendas;
	}

	public void setFacturasTiendas(Set<FacturaTienda> facturasTiendas) {
		this.facturasTiendas = facturasTiendas;
	} // set de facturas tienda

	public Set<FacturaHospital> getFacturasHospital() {
		return facturasHospital;
	} // get facturas hsoptal

	//set facturas hospital
	public void setFacturasHospital(Set<FacturaHospital> facturasHospital) {
		this.facturasHospital = facturasHospital;
	}
}
