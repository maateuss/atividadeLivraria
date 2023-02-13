package com.mateus.atividadeLivraria.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateus.atividadeLivraria.model.Livro;
import com.mateus.atividadeLivraria.repository.LivroRepository;
import com.mateus.atividadeLivraria.services.interfaces.LivroService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class LivroServiceImpl implements LivroService {
    @Autowired
    private LivroRepository repository;

    @Override
    public List<Livro> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public Livro buscarUm(Long Id) {
        return repository.findById(Id).orElseThrow();
    }

    @Override
    public Livro criar(Livro object) {
        return repository.save(object);
    }

    @Override
    public Livro editar(Long id, Livro newObject) {
        Optional<Livro> Livro = repository.findById(id);
        
        if(Livro.isPresent()) {
            newObject.setId(Livro.get().getId());
            return repository.save(newObject);
        }

        throw new EntityNotFoundException();
    }

    @Override
    public void excluir(Long Id) {
        repository.deleteById(Id);
    }
}
