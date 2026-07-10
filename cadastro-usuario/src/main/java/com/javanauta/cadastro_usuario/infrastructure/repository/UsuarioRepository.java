package com.javanauta.cadastro_usuario.infrastructure.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javanauta.cadastro_usuario.infrastructure.entitys.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
  
    Optional <Usuario> findByEmail(String email);

    void 

}
