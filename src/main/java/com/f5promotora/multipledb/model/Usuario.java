package com.f5promotora.multipledb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "usuario")
public class Usuario {
    @Id
    private Long codigo;

    private String nome;

    private String email;

    private String senha;
}
