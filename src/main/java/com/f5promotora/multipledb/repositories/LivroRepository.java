package com.f5promotora.multipledb.repositories;

import com.f5promotora.multipledb.model.Livro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long>{
    
}
