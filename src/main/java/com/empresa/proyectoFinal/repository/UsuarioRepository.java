package com.empresa.proyectoFinal.repository;

import com.empresa.proyectoFinal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
