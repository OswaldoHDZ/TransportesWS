package eventos.uacm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eventos.uacm.models.document.TipoEvento;
import eventos.uacm.models.document.service.TipoEventoService;

@RestController
@RequestMapping("tipoEvento")
public class TipoEventoController {

	
	@Autowired
	TipoEventoService _tipoEventoService;
	
	@GetMapping("/listar")
	public List<TipoEvento> getAll(){
		return _tipoEventoService.obtenerTodos();	
	}
	
	@GetMapping("/buscar/{id}")
	public TipoEvento buscarId(@PathVariable String id) {
		return _tipoEventoService.buscarId(id);
	}
	
	@GetMapping("/eliminar/{id}")
	public void eliminaEventoTransporte(@PathVariable String id) {
		_tipoEventoService.eliminar(id);
	}
	
	@PostMapping("/agrega")
	public TipoEvento agregaEventoTransporte(@RequestBody TipoEvento pEventoTransporte) {
		return _tipoEventoService.insertar(pEventoTransporte);
	}
}
