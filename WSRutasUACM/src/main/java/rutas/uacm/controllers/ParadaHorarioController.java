package rutas.uacm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rutas.uacm.models.document.ParadaHorario;
import rutas.uacm.models.service.IParadaHorarioService;

@RestController
@RequestMapping("paradHorario")
public class ParadaHorarioController {

	@Autowired
	IParadaHorarioService _paradaHorarioService;
	
	@GetMapping("/listar")
	public List<ParadaHorario> getAll(){
		return _paradaHorarioService.obtenerTodos();
		
	}
	@GetMapping("/buscar/{id}")
	public ParadaHorario buscarId(@PathVariable String id) {
		return _paradaHorarioService.buscarId(id);
	}
	
	@GetMapping("/eliminar/{id}")
	public void eliminaEstuadianteId(@PathVariable String id) {
		_paradaHorarioService.eliminar(id);
	}
	
	@PostMapping("/agrega")
	public ParadaHorario agregaEstuadiante(@RequestBody ParadaHorario paradaHorario) {		
		return _paradaHorarioService.insertar(paradaHorario);
	}
}
