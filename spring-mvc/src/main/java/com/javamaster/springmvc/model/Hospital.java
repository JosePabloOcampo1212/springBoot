package com.javamaster.springmvc.model;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Table(name = "hospital")
@Entity
@Data
public class Hospital extends BaseEntity {
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="tienda_id", insertable=false, updatable=false)
	private Tienda tienda;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "hospital", fetch = FetchType.EAGER)
	private Set<Cliente> clientes;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "hospital", fetch = FetchType.EAGER)
	private Set<Veterinario> veterinarios;

// devuelve la tienda
	public Tienda getTienda() {
		return tienda;
	}
	// setea la tienda

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}
/// devuelve al cliente
	public Set<Cliente> getClientes() {
		return clientes;
	}
// setea al cliente
	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}
// sevuelve los veterinarios
	public Set<Veterinario> getVeterinarios() {
		return veterinarios;
	}
// setea los veterinarios
	public void setVeterinarios(Set<Veterinario> veterinarios) {
		this.veterinarios = veterinarios;
	}
}

