package com.generation.blogpessoaal.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.generation.blogpessoaal.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Optional<Usuario> findByUsuario(String usuario);
	
}
