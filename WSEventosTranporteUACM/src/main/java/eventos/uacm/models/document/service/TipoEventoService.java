package eventos.uacm.models.document.service;

import java.util.List;

import eventos.uacm.models.document.TipoEvento;

public interface TipoEventoService {
	List<TipoEvento> obtenerTodos();
	TipoEvento buscarId(String id);
	TipoEvento insertar(TipoEvento tipoEvento);
	void eliminar(String id);
}
