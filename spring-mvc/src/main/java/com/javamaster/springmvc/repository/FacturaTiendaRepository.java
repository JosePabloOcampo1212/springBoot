package com.javamaster.springmvc.repository;

import com.javamaster.springmvc.model.Cliente;
import com.javamaster.springmvc.model.FacturaHospital;
import com.javamaster.springmvc.model.FacturaTienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaTiendaRepository extends JpaRepository<FacturaTienda, Integer> {
}
