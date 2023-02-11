package com.mateus.atividadeLivraria.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateus.atividadeLivraria.model.Livro;

@RestController
@RequestMapping("/livros")
public class LivroController extends BaseController<Livro> {
    
}