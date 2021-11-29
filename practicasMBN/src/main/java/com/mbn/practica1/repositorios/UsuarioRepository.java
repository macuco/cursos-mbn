package com.mbn.practica1.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbn.practica1.entidades.Usuario;

//CREAR, OBTENER, ELIMINAR, ACTUALIZAR ...
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
