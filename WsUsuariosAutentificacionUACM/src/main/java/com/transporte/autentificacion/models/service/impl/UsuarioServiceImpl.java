package com.transporte.autentificacion.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transporte.autentificacion.models.document.Usuario;
import com.transporte.autentificacion.models.repository.IUsuarioRepository;
import com.transporte.autentificacion.models.service.IUsuarioService;
@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	IUsuarioRepository _usuarioRepository;
	@Override
	public List<Usuario> obtenerTodos() {
		return _usuarioRepository.findAll();
	}

	@Override
	public Usuario buscarId(String id) {
		return _usuarioRepository.findById(id).orElse(null);
	}

	@Override
	public Usuario insertar(Usuario usuario) {
		return _usuarioRepository.save(usuario);
	}

	@Override
	public void eliminar(String id) {
		_usuarioRepository.deleteById(id);
	}

}
