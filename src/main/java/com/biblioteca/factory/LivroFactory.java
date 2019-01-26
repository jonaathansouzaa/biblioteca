package com.biblioteca.factory;

import org.springframework.stereotype.Component;

import com.biblioteca.dto.LivroDTO;
import com.biblioteca.model.Livro;

@Component
public class LivroFactory {

	public LivroDTO getInstance(Livro livro) {
		LivroDTO livroDTO = new LivroDTO();
		livroDTO.setNome(livro.getNome());
		livroDTO.setDescricao(livro.getDescricao());
		livroDTO.setAuthor(livro.getAuthor());
		livroDTO.setEditora(livro.getEditora());
		return livroDTO;
	}
	
	public Livro getInstance(LivroDTO livroDTO) {
//		if (livroDTO.getNome() == null) {
//			throw new IllegalArgumentException("Campo nome não pode ser nulo.");
//		}
//		
//		if (livroDTO.getNome().isEmpty()) {
//			throw new IllegalArgumentException("Campo nome não pode ser vazio.");
//		}
		
		Livro livro = new Livro();
		livro.setNome(livro.getNome());
		livro.setDescricao(livro.getDescricao());
		livro.setAuthor(livro.getAuthor());
		livro.setEditora(livro.getEditora());
		return livro;
	}

}
