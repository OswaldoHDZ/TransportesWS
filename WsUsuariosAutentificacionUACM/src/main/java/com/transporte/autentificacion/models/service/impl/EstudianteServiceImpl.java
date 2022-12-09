package com.transporte.autentificacion.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transporte.autentificacion.models.document.Estudiante;
import com.transporte.autentificacion.models.repository.IEstudianteRepository;
import com.transporte.autentificacion.models.service.IEstudianteService;

@Service
public class EstudianteServiceImpl implements IEstudianteService{
	@Autowired
	IEstudianteRepository estudianteRepository;
	@Override
	public List<Estudiante> obtenerTodos() {
		
		return estudianteRepository.findAll();
	}

	@Override
	public Estudiante buscarId(String id) {
		return estudianteRepository.findById(id).orElse(null);
	}

	@Override
	public Estudiante insertar(Estudiante estudiante) {
		return estudianteRepository.save(estudiante);
	}

	@Override
	public void eliminar(String id) {
		estudianteRepository.deleteById(id);
		
	}

	@Override
	public Estudiante buscarCorreo(String correo) {
		
		return estudianteRepository.findByCorreo(correo);
	}

}
