package com.f5promotora.multipledb.repositories;

import com.f5promotora.multipledb.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
