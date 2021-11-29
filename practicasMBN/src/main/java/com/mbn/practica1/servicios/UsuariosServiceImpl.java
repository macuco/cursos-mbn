package com.mbn.practica1.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbn.practica1.entidades.Usuario;
import com.mbn.practica1.repositorios.UsuarioRepository;

@Service
public class UsuariosServiceImpl implements UsuariosService {
	
	@Autowired
	UsuarioRepository usuariosRepo;
	
	@Override
	public void registrar(Usuario usuario) {
		//TODO validar que no exista el usuario o correo
		//TODO validar que la contraseña sea correcta
		usuariosRepo.save(usuario);
	}

	@Override
	public Usuario consultar(Integer id) {
		//return usuariosRepo.getById(id); //Nos da un error
		return usuariosRepo.findById(id).orElseThrow(()->new RuntimeException("Usuario no encontrado"));
	}

	@Override
	public List<Usuario> consultarTodos() {
		return usuariosRepo.findAll();
	}

	@Override
	public void actualizar(Usuario usuario) {
		//TODO Buscar que exista el usuario con ID
		//TODO Modificar los datos a actualizar
		usuariosRepo.save(usuario);
	}

	@Override
	public void eliminar(Integer id) {
		usuariosRepo.deleteById(id);
	}

}
