package com.f5promotora.multipledb.controller;

import java.util.List;

import com.f5promotora.multipledb.model.Livro;
import com.f5promotora.multipledb.service.LivroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroController {
    
    @Autowired
    private LivroService livroService;

    @GetMapping()
    public List<Livro> obterLivros(){
        return this.livroService.obterLivros();
    }
}
