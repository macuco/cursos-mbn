package com.mbn.practica1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mbn.practica1.entidades.Usuario;
import com.mbn.practica1.repositorios.UsuarioRepository;
import com.mbn.practica1.servicios.UsuariosService;


@SpringBootApplication
public class PracticasMbnApplication {

	public static void main(String[] args) {
		
  	  
		SpringApplication.run(PracticasMbnApplication.class, args);
	}
	
	@Bean
	  public ApplicationRunner applicationStartupRunner(UsuariosService usuariosService) {
	      return (args) -> {
	    	  Usuario usuario = new Usuario();
	    	  usuario.setNombre("Leo");
	    	  usuario.setCorreo("Leo@mbn.com.mx");
	    	  
	    	  //usuariosService.registrar(usuario);
				
	    	  System.out.println(usuariosService.consultarTodos());
	    	  System.out.println(usuariosService.consultar(1));
	      };
	      
	      
	    /*return new ApplicationRunner() {
	    	  
	    	  @Autowired
	    	  UsuariosService usuariosService;
	    	  
			@Override
			public void run(ApplicationArguments args ) throws Exception {
				
				//usuarioRepo.save(usuario);
				//List<Usuario> usuarios = usuarioRepo.findAll();
				
				//System.out.println(usuariosService.consultarTodos());
				
				Usuario usuario = new Usuario();
				usuario.setNombre("Leo");
				usuario.setCorreo("Leo@mbn.com.mx");
				
				//usuariosService.registrar(usuario);
				
				//System.out.println(usuariosService.consultarTodos());
				
				System.out.println(usuariosService.consultar(6));
				
				
			}
	    	  
	      };*/
	  }

}
