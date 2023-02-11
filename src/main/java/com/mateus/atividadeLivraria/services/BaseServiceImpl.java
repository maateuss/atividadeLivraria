package com.mateus.atividadeLivraria.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.mateus.atividadeLivraria.model.BaseEntity;
import com.mateus.atividadeLivraria.repository.BaseRepository;
import com.mateus.atividadeLivraria.services.interfaces.BaseService;

import jakarta.persistence.EntityNotFoundException;
public abstract class BaseServiceImpl<T extends BaseEntity> implements BaseService<T>{
   
    @Autowired
    public BaseRepository<T> repository;

    @Override
    public List<T> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public T buscarUm(Long Id) {
        return repository.findById(Id).orElseThrow();
    }

    @Override
    public void excluir(Long Id) {
        repository.deleteById(Id);
    }

    @Override
    public T editar(Long id, T newObject){
        
        Optional<T> editora = repository.findById(id);

        if(editora.isPresent()){
            newObject.setId(id);
            return repository.save(newObject);
        }

        throw new EntityNotFoundException();
        
    }

    @Override
    public T criar(T object) {
        return repository.save(object);
    }


}
