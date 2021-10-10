package com.javamaster.springmvc.repository;

import com.javamaster.springmvc.model.Especialidad;
import com.javamaster.springmvc.model.Expediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpedienteRepository extends JpaRepository<Expediente, Integer> {
}
