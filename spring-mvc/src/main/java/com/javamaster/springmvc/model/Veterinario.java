package com.javamaster.springmvc.model;

import javax.persistence.*;
import java.util.Set;

@Table(name = "veterinario")
@Entity
public class Veterinario extends Persona{

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hospital_id")
	private Hospital hospital;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "veterinario_especialidad", joinColumns = @JoinColumn(name = "veterinario_id"),
		inverseJoinColumns = @JoinColumn(name = "especialidad_id"))
	private Set<Especialidad> especialidades;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "veterinario", fetch = FetchType.EAGER)
	private Set<Horario> horarios;

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Set<Especialidad> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(Set<Especialidad> especialidades) {
		this.especialidades = especialidades;
	}

	public Set<Horario> getHorarios() {
		return horarios;
	}

	public void setHorarios(Set<Horario> horarios) {
		this.horarios = horarios;
	}
}
