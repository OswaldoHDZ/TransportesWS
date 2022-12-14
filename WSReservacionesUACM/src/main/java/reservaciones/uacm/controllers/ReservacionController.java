package reservaciones.uacm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reservaciones.uacm.models.document.Reservacion;
import reservaciones.uacm.models.service.imp.ReservacionServiceImpl;


@RestController
@RequestMapping("reservacion")
public class ReservacionController {
	@Autowired
	ReservacionServiceImpl _reservacionServiceImpl;
	
	@GetMapping("/listar")
	public List<Reservacion> getAll(){
		return _reservacionServiceImpl.obtenerTodos();
	}
	
	@GetMapping("/buscar/{id}")
	public Reservacion buscarId(@PathVariable String id) {
		return _reservacionServiceImpl.buscarId(id);
	}
	
	@GetMapping("/eliminar/{id}")
	public void eliminaReservacionId(@PathVariable String id) {
		_reservacionServiceImpl.eliminar(id);
	}
	
	@PostMapping("/agrega")
	public Reservacion agregaReservacion(@RequestBody Reservacion estudiante) {
		return this._reservacionServiceImpl.insertar(estudiante);
	}
}
