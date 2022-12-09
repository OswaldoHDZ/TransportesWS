package com.transporte.autentificacion.models.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection="estudiantes")
public class Estudiante {
	@Id
	private String id;
	private String nombre;
	private String appaterno;
	private String apmaterno;
	private String matricula;
	@Field("correo")
	@Indexed(unique = true)
	private String correo;
	private String telefono;
	private Integer estado;
	
}