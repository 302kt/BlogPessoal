package com.generation.blogpessoaal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.blogpessoaal.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Optional<Usuario> findByUsuario(String usuario);
	
	//List<Usuario> findAllByUsuarioContainingIgnoreCase(@Param("usuario")String usuario);
	
}
