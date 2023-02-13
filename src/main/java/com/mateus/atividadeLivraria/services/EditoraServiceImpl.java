package com.mateus.atividadeLivraria.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateus.atividadeLivraria.model.Editora;
import com.mateus.atividadeLivraria.repository.EditoraRepository;
import com.mateus.atividadeLivraria.services.interfaces.EditoraService;

import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.ReportAsSingleViolation;

@Service
public class EditoraServiceImpl implements EditoraService {

    @Autowired
    private EditoraRepository repository;

    @Override
    public List<Editora> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public Editora buscarUm(Long Id) {
        return repository.findById(Id).orElseThrow();
    }

    @Override
    public Editora criar(Editora object) {
        return repository.save(object);
    }

    @Override
    public Editora editar(Long id, Editora newObject) {
        Optional<Editora> editora = repository.findById(id);
        
        if(editora.isPresent()) {
            newObject.setId(editora.get().getId());
            return repository.save(newObject);
        }

        throw new EntityNotFoundException();
    }

    @Override
    public void excluir(Long Id) {
        repository.deleteById(Id);
    }
    
}
