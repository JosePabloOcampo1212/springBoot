package com.javamaster.springmvc.repository;

import com.javamaster.springmvc.model.Cliente;
import com.javamaster.springmvc.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
