package reservaciones.uacm.models.service;

import java.util.List;

import reservaciones.uacm.models.document.Reservacion;

public interface IReservacionService {
	List<Reservacion> obtenerTodos();
	Reservacion buscarId(String id);
	Reservacion insertar(Reservacion pReservacion);
	void eliminar(String id);
}
