package rutas.uacm.models.service;

import java.util.List;

import rutas.uacm.models.document.ParadaHorario;

public interface IParadaHorarioService {
	List<ParadaHorario> obtenerTodos();
	ParadaHorario buscarId(String id);
	ParadaHorario insertar(ParadaHorario paradaHorario);
	void eliminar(String id);
}
