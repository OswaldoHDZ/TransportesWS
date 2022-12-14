package rutas.uacm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rutas.uacm.models.document.Ruta;
import rutas.uacm.models.service.IRutaService;


@RestController
@RequestMapping("ruta")
public class RutaController {
	
	@Autowired
	IRutaService _rutaService;
	
	@GetMapping("/listar")
	public List<Ruta> getAll(){
		return _rutaService.obtenerTodos();
		
	}
	@GetMapping("/buscar/{id}")
	public Ruta buscarId(@PathVariable String id) {
		return _rutaService.buscarId(id);
	}
	
	@GetMapping("/eliminar/{id}")
	public void eliminaEstuadianteId(@PathVariable String id) {
		_rutaService.eliminar(id);
	}
	
	@PostMapping("/agrega")
	public Ruta agregaEstuadiante(@RequestBody Ruta ruta) {		
		return _rutaService.insertar(ruta);
	}
	
}
