package com.mateus.atividadeLivraria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Editora extends BaseEntity {
    
    @Column(name="nome", nullable=false, unique=true, length = 256)
    private String nome;

    @Column(name="descricao")
    private String descricao;
}
