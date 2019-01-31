package com.biblioteca.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class LivroDTO {

	@NotNull
	@NotEmpty
	private String nome;
	private String descricao;
	private String author;
	private String editora;

	public LivroDTO() {

	}
	
	public LivroDTO(String nome) {
		this.nome = nome;
	}
	
	public LivroDTO(String nome, String descricao, String author, String editora) {
		this.nome = nome;
		this.descricao = descricao;
		this.author = author;
		this.editora = editora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	@Override
	public String toString() {
		return "LivroDTO [nome=" + nome + ", descricao=" + descricao + ", author=" + author + ", editora=" + editora + "]";
	}

}
