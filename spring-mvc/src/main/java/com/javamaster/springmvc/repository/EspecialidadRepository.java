package com.javamaster.springmvc.repository;

import com.javamaster.springmvc.model.Cliente;
import com.javamaster.springmvc.model.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface EspecialidadRepository extends JpaRepository<Especialidad, Integer> {
}
