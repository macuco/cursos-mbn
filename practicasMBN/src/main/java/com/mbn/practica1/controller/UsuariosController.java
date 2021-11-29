package com.mbn.practica1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mbn.practica1.entidades.Usuario;
import com.mbn.practica1.servicios.UsuariosService;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
	
	@Autowired
	UsuariosService usuariosService;
	
	@GetMapping
	public List<Usuario> obtenerTodos(){
		return usuariosService.consultarTodos();
	}
	
	@GetMapping("/saludar")
	public String saludar(){
		return "Hola mundo de usuarios ";
	}
	
	@GetMapping("/{usuarioId}")
	public Usuario obtenerPorId(@PathVariable Integer usuarioId){
		return usuariosService.consultar(usuarioId);
	}
	
	@PostMapping
	public void registrarUsuario(@RequestBody Usuario usuario) {
		usuariosService.registrar(usuario);
	}
	
	@PutMapping("/{usuarioId}")
	public void actualizarUsuario(@RequestBody Usuario usuario) {
		usuariosService.actualizar(usuario);
	}
	
	@DeleteMapping("/{usuarioId}")
	public void eliminarUsuario(@PathVariable Integer usuarioId) {
		usuariosService.eliminar(usuarioId);
	}
	
}
