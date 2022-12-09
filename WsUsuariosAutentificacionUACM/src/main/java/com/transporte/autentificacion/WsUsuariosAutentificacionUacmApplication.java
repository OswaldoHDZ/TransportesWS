package com.transporte.autentificacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.core.MongoTemplate;
import com.transporte.autentificacion.models.service.IUsuarioService;

@EnableEurekaClient
@SpringBootApplication
public class WsUsuariosAutentificacionUacmApplication {//implements CommandLineRunner{
	@Autowired 
	MongoTemplate mongo;
	
	@Autowired
	IUsuarioService _usuarioServicey;
	
	public static void main(String[] args) {
		SpringApplication.run(WsUsuariosAutentificacionUacmApplication.class, args);
	}

	//@Override
	//public void run(String... args) throws Exception {
	//	mongo.dropCollection("usuarios");
	//	
	//	if(!mongo.collectionExists("usuarios")) {
	//		Usuario user = new Usuario();
	//		user.setNombre("Oswaldo");
	//		user.setEmail("oswaldo@uacm.com");
	//		user.setPassword(new BCryptPasswordEncoder().encode("123456"));
	//		_usuarioServicey.insertar(user);
	//	}
	//}

}
