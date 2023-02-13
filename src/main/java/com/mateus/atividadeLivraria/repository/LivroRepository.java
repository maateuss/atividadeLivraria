package com.mateus.atividadeLivraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mateus.atividadeLivraria.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
    
}
