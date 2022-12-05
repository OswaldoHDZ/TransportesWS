package rutas.uacm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rutas.uacm.models.document.UnidadTransporte;
import rutas.uacm.models.service.IUnidadTransporteService;


@RestController
@RequestMapping("unidadTransporte")
public class UnidadTransporteController {
	
	@Autowired
	IUnidadTransporteService _unidadTransporteService;
	
	@GetMapping("/listar")
	public List<UnidadTransporte> getAll(){
		return _unidadTransporteService.obtenerTodos();
		
	}
	@GetMapping("/buscar/{id}")
	public UnidadTransporte buscarId(@PathVariable String id) {
		return _unidadTransporteService.buscarId(id);
	}
	
	@GetMapping("/eliminar/{id}")
	public void eliminaEstuadianteId(@PathVariable String id) {
		_unidadTransporteService.eliminar(id);
	}
	
	@PostMapping("/agrega")
	public UnidadTransporte agregaEstuadiante(@RequestBody UnidadTransporte unidadTransporte) {		
		return _unidadTransporteService.insertar(unidadTransporte);
	}
}
