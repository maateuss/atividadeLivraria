package com.mateus.atividadeLivraria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateus.atividadeLivraria.model.Categoria;
import com.mateus.atividadeLivraria.services.interfaces.CategoriaService;

@RequestMapping("/categoria")
@RestController
public class CategoriaController extends BaseController<Categoria> {

    public CategoriaController(CategoriaService service) {
        super(service);
    }
    
}
