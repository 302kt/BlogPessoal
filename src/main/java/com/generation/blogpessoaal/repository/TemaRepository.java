package com.generation.blogpessoaal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.blogpessoaal.model.Tema;

public interface TemaRepository extends JpaRepository <Tema, Long>{
	
	List<Tema> findAllByTituloContainingIgnoreCase(@Param("título")String titulo);

}
