package com.f5promotora.multipledb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="livro")
public class Livro {
    @Id
    private Long codigo;

    private String titulo;

    private String autor;

    private String tema;

    @Column(name = "nome_usuario")
    private String nomeUsuario;
}
