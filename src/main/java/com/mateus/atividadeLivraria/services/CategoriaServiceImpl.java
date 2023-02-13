package com.mateus.atividadeLivraria.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateus.atividadeLivraria.model.Categoria;
import com.mateus.atividadeLivraria.repository.CategoriaRepository;
import com.mateus.atividadeLivraria.services.interfaces.CategoriaService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CategoriaServiceImpl implements CategoriaService {
   
    @Autowired
    private CategoriaRepository repository;

    @Override
    public List<Categoria> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public Categoria buscarUm(Long Id) {
        return repository.findById(Id).orElseThrow();
    }

    @Override
    public Categoria criar(Categoria object) {
        return repository.save(object);
    }

    @Override
    public Categoria editar(Long id, Categoria newObject) {
        Optional<Categoria> Categoria = repository.findById(id);
        
        if(Categoria.isPresent()) {
            newObject.setId(Categoria.get().getId());
            return repository.save(newObject);
        }

        throw new EntityNotFoundException();
    }

    @Override
    public void excluir(Long Id) {
        repository.deleteById(Id);
    }
}
