package com.javamaster.springmvc.model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.Set;

@Table(name = "mascota")
@Entity
@Data
public class Mascota extends EntidadNombrada {

	@Column(name = "tipo")
	@NotEmpty
	private String tipo;

	@Column(name = "fecha_de_nacimiento")
	@NotEmpty
	private Date fechaDeNacimiento;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "mascota", fetch = FetchType.EAGER)
	private Set<Expediente> expedientes;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_id", insertable=false, updatable=false)
	private Hospital cliente;

	// get tipo
	public String getTipo() {
		return tipo;
	}
// setea el tipo
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
// devuelve la fecha
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
// setea la fecha
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
// devuelve el expediente
	public Set<Expediente> getExpedientes() {
		return expedientes;
	}
// setea el expediente
	public void setExpedientes(Set<Expediente> expedientes) {
		this.expedientes = expedientes;
	}
// devuelve el hospital
	public Hospital getCliente() {
		return cliente;
	}
// setea el clietne
	public void setCliente(Hospital cliente) {
		this.cliente = cliente;
	}
}
