package com.javamaster.springmvc.model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.Set;

@Table(name = "servicio")
@Entity

public class Servicio extends BaseEntity {

	@Column(name = "fecha")
	@NotEmpty
	private Date fecha;

	@Column(name = "descripcion")
	@NotEmpty
	private String descripcion;


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "veterinario_id")
	private Veterinario veterinario;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "expediente_id")
	private Expediente expediente;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "factura_hospital_id")
	private FacturaHospital facturaHospital;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "servicio", fetch = FetchType.EAGER)
	private Set<ProductoComprado> productoComprados;

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	public Expediente getExpediente() {
		return expediente;
	}

	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}

	public FacturaHospital getFacturaHospital() {
		return facturaHospital;
	}

	public void setFacturaHospital(FacturaHospital facturaHospital) {
		this.facturaHospital = facturaHospital;
	}

	public Set<ProductoComprado> getProductoComprados() {
		return productoComprados;
	}

	public void setProductoComprados(Set<ProductoComprado> productoComprados) {
		this.productoComprados = productoComprados;
	}
}
