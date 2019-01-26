package com.biblioteca.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.biblioteca.dto.LivroDTO;
import com.biblioteca.factory.LivroFactory;
import com.biblioteca.model.Livro;
import com.biblioteca.repository.LivroRepository;

@RunWith(MockitoJUnitRunner.class)
public class LivroServiceTest {

	@Mock
	private LivroRepository livroRepository;
	
	@Mock
	private LivroFactory livroFactory;
	
	@InjectMocks
	private LivroService livroService;
	
	@Test
	public void test1() {
		Livro livro = new Livro("Senhor dos aneis - Triologia");
		LivroDTO livroDTO = new LivroDTO("Senhor dos aneis - Triologia");
		when(livroFactory.getInstance(livro)).thenReturn(livroDTO);
		when(livroRepository.buscarTodosLivros()).thenReturn(Arrays.asList(livro));
		List<LivroDTO> livros = livroService.buscarTodosLivros();
		assertEquals(Arrays.asList(livroDTO), livros);
	}
	
}
