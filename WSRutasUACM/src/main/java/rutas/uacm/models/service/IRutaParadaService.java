package rutas.uacm.models.service;

import java.util.List;

import rutas.uacm.models.document.RutaParada;

public interface IRutaParadaService {
	List<RutaParada> obtenerTodos();
	RutaParada buscarId(String id);
	RutaParada insertar(RutaParada rutaParada);
	void eliminar(String id);
}
