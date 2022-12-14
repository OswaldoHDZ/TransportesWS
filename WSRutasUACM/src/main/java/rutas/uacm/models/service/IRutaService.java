package rutas.uacm.models.service;

import java.util.List;

import rutas.uacm.models.document.Ruta;

public interface IRutaService {
	List<Ruta> obtenerTodos();
	Ruta buscarId(String id);
	Ruta insertar(Ruta ruta);
	void eliminar(String id);
}
