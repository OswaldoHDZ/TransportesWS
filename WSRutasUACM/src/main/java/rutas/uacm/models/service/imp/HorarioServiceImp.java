package rutas.uacm.models.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rutas.uacm.models.document.Horario;
import rutas.uacm.models.repository.IHorarioRepository;
import rutas.uacm.models.service.IHorarioService;

@Service
public class HorarioServiceImp implements IHorarioService{
	
	@Autowired
	IHorarioRepository _horarioRepository;

	@Override
	public List<Horario> obtenerTodos() {
		return _horarioRepository.findAll();
	}

	@Override
	public Horario buscarId(String id) {
		return _horarioRepository.findById(id).orElse(null);
	}

	@Override
	public Horario insertar(Horario horario) {
		return _horarioRepository.save(horario);
	}

	@Override
	public void eliminar(String id) {
		_horarioRepository.deleteById(id);
	}

}
