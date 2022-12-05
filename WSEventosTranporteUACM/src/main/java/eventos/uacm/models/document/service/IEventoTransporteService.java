package eventos.uacm.models.document.service;

import java.util.List;

import eventos.uacm.models.document.EventoTransporte;

public interface IEventoTransporteService {
	List<EventoTransporte> obtenerTodos();
	EventoTransporte buscarId(String id);
	EventoTransporte insertar(EventoTransporte eventoTransporte);
	void eliminar(String id);
}