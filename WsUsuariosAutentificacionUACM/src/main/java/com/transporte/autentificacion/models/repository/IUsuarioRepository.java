package com.transporte.autentificacion.models.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.transporte.autentificacion.models.document.Usuario;

public interface IUsuarioRepository extends MongoRepository<Usuario, String> {

	Usuario findByEmail(String email);
	
}