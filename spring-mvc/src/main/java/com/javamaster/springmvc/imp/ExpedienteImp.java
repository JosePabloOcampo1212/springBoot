package com.javamaster.springmvc.imp;

import com.javamaster.springmvc.model.Especialidad;
import com.javamaster.springmvc.model.Expediente;
import com.javamaster.springmvc.repository.EspecialidadRepository;
import com.javamaster.springmvc.repository.ExpedienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ExpedienteImp {

    @Autowired
    private EspecialidadRepository especialidadRepository;

    public List<Especialidad> findAll() {
        return this.especialidadRepository.findAll();
    }
}
