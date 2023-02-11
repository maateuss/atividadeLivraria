package com.mateus.atividadeLivraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mateus.atividadeLivraria.model.BaseEntity;

@Repository
public interface BaseRepository<T extends BaseEntity> extends JpaRepository<T, Long> {
    
}
