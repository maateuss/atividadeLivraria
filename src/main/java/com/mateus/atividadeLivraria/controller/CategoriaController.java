package com.mateus.atividadeLivraria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateus.atividadeLivraria.model.Categoria;

@RestController
@RequestMapping("/categoria")
public class CategoriaController extends BaseController<Categoria> {
    
}
