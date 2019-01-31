package com.biblioteca.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	private ResponseEntity<?> insereLivro(@RequestBody LivroDTO livroDTO) {
		return ResponseEntity.ok(livroService.buscarTodosLivros());
	}
	
}
