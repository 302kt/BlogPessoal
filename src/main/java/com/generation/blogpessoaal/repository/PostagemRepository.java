package com.generation.blogpessoaal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoaal.model.Postagem;


public interface PostagemRepository extends JpaRepository<Postagem, Long>{

	
	List<Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);

	// SELECT * FROM tb_postagens WHERE titulo like "%???%"; 

}
