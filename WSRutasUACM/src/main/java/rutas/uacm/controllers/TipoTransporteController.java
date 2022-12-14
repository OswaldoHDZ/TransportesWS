package rutas.uacm.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rutas.uacm.models.document.TipoTransporte;
import rutas.uacm.models.service.ITipoTransporteService;


@RestController
@RequestMapping("tipoTransporte")
public class TipoTransporteController {
	
	
	@Autowired
	ITipoTransporteService _tipoTransporteService;
	
	
	@GetMapping("/listar")
	public List<TipoTransporte> getAll(){
		return _tipoTransporteService.obtenerTodos();
		
	}
	@GetMapping("/buscar/{id}")
	public TipoTransporte buscarId(@PathVariable String id) {
		return _tipoTransporteService.buscarId(id);
	}
	
	@GetMapping("/eliminar/{id}")
	public void eliminaEstuadianteId(@PathVariable String id) {
		_tipoTransporteService.eliminar(id);
	}
	
	@PostMapping("/agrega")
	public TipoTransporte agregaEstuadiante(@RequestBody TipoTransporte tipoTransporte) {		
		return _tipoTransporteService.insertar(tipoTransporte);
	}
}
