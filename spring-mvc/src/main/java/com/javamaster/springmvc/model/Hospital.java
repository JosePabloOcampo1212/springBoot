package com.javamaster.springmvc.model;
import javax.persistence.*;
import java.util.Set;

@Table(name = "hospital")
@Entity
public class Hospital extends BaseEntity {
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="tienda_id", insertable=false, updatable=false)
	private Tienda tienda;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "hospital", fetch = FetchType.EAGER)
	private Set<Cliente> clientes;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "hospital", fetch = FetchType.EAGER)
	private Set<Veterinario> veterinarios;

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Set<Veterinario> getVeterinarios() {
		return veterinarios;
	}

	public void setVeterinarios(Set<Veterinario> veterinarios) {
		this.veterinarios = veterinarios;
	}
}

