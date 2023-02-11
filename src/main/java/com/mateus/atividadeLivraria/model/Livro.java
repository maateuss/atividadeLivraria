package com.mateus.atividadeLivraria.model;

import jakarta.persistence.Column;

public class Livro extends BaseEntity{
    @Column(name="nome", nullable=false, unique=true, length = 256)
    private String nome;

    @Column(name="isbn", nullable=false, unique=true, length = 13)
    private String isbn;
}
