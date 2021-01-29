package com.f5promotora.multipledb.service.impl;

import java.util.List;

import com.f5promotora.multipledb.model.Livro;
import com.f5promotora.multipledb.repositories.LivroRepository;
import com.f5promotora.multipledb.service.LivroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroServiceImpl implements LivroService{

    @Autowired
    private LivroRepository livroRepository;

	@Override
	public List<Livro> obterLivros() {
		// TODO Auto-generated method stub
		return this.livroRepository.findAll();
	}
    
}
