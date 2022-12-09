package com.transporte.autentificacion.controllers;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transporte.autentificacion.models.document.Estudiante;
import com.transporte.autentificacion.models.service.IEstudianteService;


@RestController
@RequestMapping("estudiante")
public class EstudianteController {
	@Autowired
	IEstudianteService estudianteService;
	@GetMapping("/listar")
	public List<Estudiante> getAll(){
		return estudianteService.obtenerTodos();
		
	}
	@GetMapping("/buscar/{id}")
	public Estudiante buscarId(@PathVariable String id) {
		return estudianteService.buscarId(id);
	}
	
	@GetMapping("/eliminar/{id}")
	public void eliminaEstuadianteId(@PathVariable String id) {
		estudianteService.eliminar(id);
	}
	
	@PostMapping("/agrega")
	public Estudiante agregaEstuadiante(@RequestBody Estudiante estudiante) {		
		return estudianteService.insertar(estudiante);
	}
	
	@GetMapping("/buscar-correo/{correo}")
	public ResponseEntity<?> buscarCorreo(@PathVariable String correo) {
		Map<String,Object> response= new HashMap<>();
		Estudiante e = estudianteService.buscarCorreo(correo);
		if(e!=null) {
			response.put("estudiante", e);
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK);
		}
		else {
			response.put("data", "No se encuentra el recurso");
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.NOT_FOUND);
		}
	}
	
}