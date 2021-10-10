package com.javamaster.springmvc.model;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Table(name = "producto")
@Entity
@Data
public class Producto extends EntidadNombrada {
	@Column(name = "descripcion")
	@NotEmpty
	private String descripcion;

	@Column(name = "cantidad_en_existencia")
	@NotEmpty
	private int cantidadEnExistencia;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tienda_id", insertable=false, updatable=false)
	private Tienda tienda;
}

