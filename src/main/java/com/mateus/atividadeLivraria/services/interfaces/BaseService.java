package com.mateus.atividadeLivraria.services.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.atividadeLivraria.model.BaseEntity;

public interface BaseService<T extends BaseEntity> {
    List<T> buscarTodos();
    T buscarUm(Long Id);
    T criar(T object);
    T editar(Long id, T newObject);
    void excluir(Long Id);
}
