package com.mateus.atividadeLivraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mateus.atividadeLivraria.model.Editora;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Long> {
    
}
