package com.generation.blogpessoaal.model;

import java.time.LocalDateTime;
import java.util.Optional;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_postagens")
public class Postagem {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "o atributo título é obrigatório!")
	@Size(min = 5, max = 100, message = "o atributo título deve possuir no mínimo 05 e no máximo 100 caracteres.")
	private String titulo;
	
	@NotBlank(message = "o atributo texto é obrigatório!")
	@Size(min = 10, max = 1000, message = "o atributo texto deve possuir no mínimo 10 e no máximo 1000 caracteres.")
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Optional<Postagem> map(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
