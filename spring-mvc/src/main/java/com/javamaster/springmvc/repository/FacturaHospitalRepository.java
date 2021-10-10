package com.javamaster.springmvc.repository;

import com.javamaster.springmvc.model.Expediente;
import com.javamaster.springmvc.model.FacturaHospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaHospitalRepository extends JpaRepository<FacturaHospital, Integer> {
}
