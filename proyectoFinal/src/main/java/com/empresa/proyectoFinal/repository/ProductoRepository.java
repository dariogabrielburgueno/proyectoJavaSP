package com.empresa.proyectoFinal.repository;

import com.empresa.proyectoFinal.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository <Producto,Integer>{
}
