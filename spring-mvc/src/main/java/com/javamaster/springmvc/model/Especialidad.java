package com.javamaster.springmvc.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Table(name = "especialidad")
@Entity
@Data
public class Especialidad extends EntidadNombrada{
    @ManyToMany(mappedBy="especialidades")
    private List<Veterinario> veterinarios;

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public void setId(Integer id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }


}
