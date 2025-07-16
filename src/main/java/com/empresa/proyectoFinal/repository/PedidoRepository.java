package com.empresa.proyectoFinal.repository;


import com.empresa.proyectoFinal.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
