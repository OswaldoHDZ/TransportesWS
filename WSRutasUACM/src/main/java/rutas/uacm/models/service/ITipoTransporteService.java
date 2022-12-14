package rutas.uacm.models.service;

import java.util.List;

import rutas.uacm.models.document.TipoTransporte;

public interface ITipoTransporteService {
	List<TipoTransporte> obtenerTodos();
	TipoTransporte buscarId(String id);
	TipoTransporte insertar(TipoTransporte tipoTransporte);
	void eliminar(String id);
}
