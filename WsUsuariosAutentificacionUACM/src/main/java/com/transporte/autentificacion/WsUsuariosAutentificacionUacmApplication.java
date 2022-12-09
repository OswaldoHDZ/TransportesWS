package com.transporte.autentificacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.transporte.autentificacion.models.document.Estudiante;
import com.transporte.autentificacion.models.service.IEstudianteService;


@SpringBootApplication
public class WsUsuariosAutentificacionUacmApplication implements CommandLineRunner{
	@Autowired 
	MongoTemplate mongo;
	
	@Autowired
	IEstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(WsUsuariosAutentificacionUacmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
