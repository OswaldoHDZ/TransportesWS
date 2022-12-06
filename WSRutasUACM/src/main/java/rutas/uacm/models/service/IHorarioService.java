package rutas.uacm.models.service;

import java.util.List;

import rutas.uacm.models.document.Horario;


public interface IHorarioService {
	List<Horario> obtenerTodos();
	Horario buscarId(String id);
	Horario insertar(Horario horario);
	void eliminar(String id);
}
