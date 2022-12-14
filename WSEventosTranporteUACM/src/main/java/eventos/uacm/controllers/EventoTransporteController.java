package eventos.uacm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eventos.uacm.models.document.EventoTransporte;
import eventos.uacm.models.document.service.IEventoTransporteService;


@RestController
@RequestMapping("eventTransporte")
public class EventoTransporteController {
	
	@Autowired
	IEventoTransporteService _eventoTransporteService;
	
	
	@GetMapping("/listar")
	public List<EventoTransporte> getAll(){
		return _eventoTransporteService.obtenerTodos();	
	}
	
	@GetMapping("/buscar/{id}")
	public EventoTransporte buscarId(@PathVariable String id) {
		return _eventoTransporteService.buscarId(id);
	}
	
	@GetMapping("/eliminar/{id}")
	public void eliminaEventoTransporte(@PathVariable String id) {
		_eventoTransporteService.eliminar(id);
	}
	
	@PostMapping("/agrega")
	public EventoTransporte agregaEventoTransporte(@RequestBody EventoTransporte pEventoTransporte) {
		return _eventoTransporteService.insertar(pEventoTransporte);
	}
}