package com.transporte.autentificacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.transporte.autentificacion.models.document.Usuario;
import com.transporte.autentificacion.models.service.IUsuarioService;


@SpringBootApplication
public class WsUsuariosAutentificacionUacmApplication implements CommandLineRunner{
	@Autowired 
	MongoTemplate mongo;
	
	@Autowired
	IUsuarioService _usuarioServicey;
	
	public static void main(String[] args) {
		SpringApplication.run(WsUsuariosAutentificacionUacmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		mongo.dropCollection("usuarios");
		
		if(!mongo.collectionExists("usuarios")) {
			Usuario user = new Usuario();
			user.setNombre("Oswaldo");
			user.setEmail("oswaldo@uacm.com");
			user.setPassword(new BCryptPasswordEncoder().encode("123456"));
			_usuarioServicey.insertar(user);
		}
	}

}
