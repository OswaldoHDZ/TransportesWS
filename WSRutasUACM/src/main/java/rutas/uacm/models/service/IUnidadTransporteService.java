package rutas.uacm.models.service;

import java.util.List;

import rutas.uacm.models.document.UnidadTransporte;

public interface IUnidadTransporteService {
	List<UnidadTransporte> obtenerTodos();
	UnidadTransporte buscarId(String id);
	UnidadTransporte insertar(UnidadTransporte unidadTransporte);
	void eliminar(String id);
}
