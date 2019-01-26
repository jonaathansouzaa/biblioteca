package com.biblioteca.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.biblioteca.model.Livro;

@Repository
public class LivroRepository {

	public List<Livro> buscarTodosLivros() {
		return new ArrayList<Livro>() {{
			add(new Livro("Senhor dos Aneis - Sociedade do anel"));
			add(new Livro("Senhor dos Aneis - As duas torres"));
			add(new Livro("Senhor dos Aneis - O retorno do rei"));
		}};
	}

}
