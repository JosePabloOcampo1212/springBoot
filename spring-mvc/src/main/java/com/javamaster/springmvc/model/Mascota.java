package com.javamaster.springmvc.model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.Set;

@Table(name = "mascota")
@Entity
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public Set<Expediente> getExpedientes() {
		return expedientes;
	}

	public void setExpedientes(Set<Expediente> expedientes) {
		this.expedientes = expedientes;
	}

	public Hospital getCliente() {
		return cliente;
	}

	public void setCliente(Hospital cliente) {
		this.cliente = cliente;
	}
}
