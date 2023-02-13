package com.mateus.atividadeLivraria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateus.atividadeLivraria.model.Editora;
import com.mateus.atividadeLivraria.services.interfaces.EditoraService;

@RequestMapping("/editora")
@RestController
public class EditoraController extends BaseController<Editora> {


    public EditoraController(EditoraService service) {
        super(service);
    }
    
}
