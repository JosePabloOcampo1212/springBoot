package com.javamaster.springmvc.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Table(name = "horario")
@Entity
public class Horario extends BaseEntity{

	@Column(name = "hora_inicio")
	@NotEmpty
	private String horaInicio;

	@Column(name = "hora_fin")
	@NotEmpty
	private String horaFin;

	@Column(name = "hora_fin")
	@NotEmpty
	private String diasLaborales;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "veterinario_id")
	private Veterinario veterinario;

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public String getDiasLaborales() {
		return diasLaborales;
	}

	public void setDiasLaborales(String diasLaborales) {
		this.diasLaborales = diasLaborales;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}
}
