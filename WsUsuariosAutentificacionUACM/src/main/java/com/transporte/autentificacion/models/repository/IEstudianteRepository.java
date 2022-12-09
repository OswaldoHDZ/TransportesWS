package com.transporte.autentificacion.models.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.transporte.autentificacion.models.document.Estudiante;

public interface IEstudianteRepository extends MongoRepository<Estudiante, String> {
	Estudiante findByCorreo(String correo);
}
