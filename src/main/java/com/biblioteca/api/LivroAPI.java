package com.biblioteca.api;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.dto.LivroDTO;
import com.biblioteca.service.LivroService;

@RestController()
public class LivroAPI {

	@Autowired
	private LivroService livroService;
	
	@GetMapping("/livros")
	private ResponseEntity<?> buscarTodosLivros() {
		return ResponseEntity.ok(livroService.buscarTodosLivros());
	}
	
	@PostMapping("/livros")
	private ResponseEntity<?> insereLivro(@RequestParam @Valid LivroDTO livroDTO) {
		return ResponseEntity.ok(livroService.buscarTodosLivros());
	}
	
}
