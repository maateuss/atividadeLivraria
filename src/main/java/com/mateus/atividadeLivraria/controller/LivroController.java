package com.mateus.atividadeLivraria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateus.atividadeLivraria.model.Livro;
import com.mateus.atividadeLivraria.services.interfaces.LivroService;

@RequestMapping("/livros")
@RestController
public class LivroController extends BaseController<Livro> {

    public LivroController(LivroService service) {
        super(service);
    }

}