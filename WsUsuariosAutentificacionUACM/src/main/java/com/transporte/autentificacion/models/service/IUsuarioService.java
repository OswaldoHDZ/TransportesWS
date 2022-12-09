package com.transporte.autentificacion.models.service;

import java.util.List;

import com.transporte.autentificacion.models.document.Usuario;


public interface IUsuarioService {
	List<Usuario> obtenerTodos();
	Usuario buscarId(String id);
	Usuario insertar(Usuario usuario);
	void eliminar(String id);
}
