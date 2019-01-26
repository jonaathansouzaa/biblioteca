package com.biblioteca.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.dto.LivroDTO;
import com.biblioteca.factory.LivroFactory;
import com.biblioteca.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroFactory LivroFactory;
	
	@Autowired
	private LivroRepository livroReposity;
	
	public List<LivroDTO> buscarTodosLivros() {
		return livroReposity.buscarTodosLivros().stream().map(LivroFactory::getInstance).collect(Collectors.toList());
	}

}
