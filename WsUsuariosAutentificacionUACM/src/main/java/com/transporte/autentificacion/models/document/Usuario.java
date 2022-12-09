package com.transporte.autentificacion.models.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
@Data
@Document(collection="usuarios")
public class Usuario {
	@Id
	private String id;
	private String nombre;
	@Field("email")
	@Indexed(unique = true)
	private String email;
	private String password;
}
