package com.instalacion.gps.repository;

import com.instalacion.gps.models.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    
}
