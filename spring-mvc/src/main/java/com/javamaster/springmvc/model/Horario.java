package com.javamaster.springmvc.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Table(name = "horario")
@Entity
@Data
public class Horario extends BaseEntity{

	@Column(name = "hora_inicio")
	@NotEmpty
	private String horaInicio;

	@Column(name = "hora_fin")
	@NotEmpty
	private String horaFin;

	@Column(name = "dias_laborales")
	@NotEmpty
	private String diasLaborales;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "veterinario_id",insertable=false, updatable=false)
	private Veterinario veterinario;

	// devuelve la hora de inico
	public String getHoraInicio() {
		return horaInicio;
	}
// setea la hora de inicio
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
// devuleve la hora de fin
	public String getHoraFin() {
		return horaFin;
	}
// setea la hora de fin
	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}
// devuelve los dias laborales
	public String getDiasLaborales() {
		return diasLaborales;
	}
// setea los dias laborales
	public void setDiasLaborales(String diasLaborales) {
		this.diasLaborales = diasLaborales;
	}
// devuelve al veterinario
	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}
}
