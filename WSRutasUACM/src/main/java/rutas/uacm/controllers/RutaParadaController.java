package rutas.uacm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rutas.uacm.models.document.RutaParada;
import rutas.uacm.models.service.IRutaParadaService;

@RestController
@RequestMapping("rutaParada")
public class RutaParadaController {
	
	@Autowired
	IRutaParadaService _rutaParadaService;
	
	
	@GetMapping("/listar")
	public List<RutaParada> getAll(){
		return _rutaParadaService.obtenerTodos();
		
	}
	@GetMapping("/buscar/{id}")
	public RutaParada buscarId(@PathVariable String id) {
		return _rutaParadaService.buscarId(id);
	}
	
	@GetMapping("/eliminar/{id}")
	public void eliminaEstuadianteId(@PathVariable String id) {
		_rutaParadaService.eliminar(id);
	}
	
	@PostMapping("/agrega")
	public RutaParada agregaEstuadiante(@RequestBody RutaParada rutaParada) {		
		return _rutaParadaService.insertar(rutaParada);
	}

}
