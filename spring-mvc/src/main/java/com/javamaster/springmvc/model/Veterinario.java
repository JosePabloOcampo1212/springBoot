package com.javamaster.springmvc.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Table(name = "veterinario")
@Data
@Entity
public class Veterinario extends Persona{

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hospital_id", insertable=false, updatable=false)
	private Hospital hospital;

	/*@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "veterinario_especialidad", joinColumns = @JoinColumn(name = "veterinario_id", insertable=false, updatable=false),
		inverseJoinColumns = @JoinColumn(name = "especialidad_id", insertable=false, updatable=false))
	private Set<Especialidad> especialidades;*/

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "veterinario", fetch = FetchType.EAGER)
	private Set<Horario> horarios;

	// seters y getters de los atributos de veterinario

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	/*public Set<Especialidad> getEspecialidades() {
		return especialidades;
	}*/

	/*public void setEspecialidades(Set<Especialidad> especialidades) {
		this.especialidades = especialidades;
	}*/

	public Set<Horario> getHorarios() {
		return horarios;
	}

	public void setHorarios(Set<Horario> horarios) {
		this.horarios = horarios;
	}
}
