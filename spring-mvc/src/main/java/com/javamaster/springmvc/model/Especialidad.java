package com.javamaster.springmvc.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Table(name = "especialidad")
@Entity
public class Especialidad extends EntidadNombrada{
    @ManyToMany(mappedBy="especialidades")
    private List<Veterinario> veterinarios;
}
