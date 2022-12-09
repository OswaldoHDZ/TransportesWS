package com.transporte.autentificacion.models.service;

import java.util.List;

import com.transporte.autentificacion.models.document.Estudiante;

public interface IEstudianteService {
	List<Estudiante> obtenerTodos();
	Estudiante buscarId(String id);
	Estudiante insertar(Estudiante estudiante);
	void eliminar(String id);
	Estudiante buscarCorreo(String correo);
}

