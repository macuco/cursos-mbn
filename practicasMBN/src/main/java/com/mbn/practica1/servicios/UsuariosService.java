package com.mbn.practica1.servicios;

import java.util.List;

import com.mbn.practica1.entidades.Usuario;

public interface UsuariosService {
	
	void registrar(Usuario usuario);
	
	Usuario consultar(Integer id);
	
	List<Usuario> consultarTodos();
	
	void actualizar(Usuario usuario);
	
	void eliminar(Integer id);
}
