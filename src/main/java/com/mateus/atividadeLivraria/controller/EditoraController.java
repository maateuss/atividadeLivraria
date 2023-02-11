package com.mateus.atividadeLivraria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateus.atividadeLivraria.model.Editora;

@RestController
@RequestMapping("/editora")
public class EditoraController extends BaseController<Editora> {

}
