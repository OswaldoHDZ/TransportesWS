package rutas.uacm.models.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rutas.uacm.models.document.ParadaHorario;
import rutas.uacm.models.repository.ParadaHorarioRepository;
import rutas.uacm.models.service.IParadaHorarioService;
@Service
public class ParadaHorarioServiceImp implements IParadaHorarioService{

	@Autowired
	ParadaHorarioRepository _paradaHorarioRepository;	
	@Override
	public List<ParadaHorario> obtenerTodos() {
		return _paradaHorarioRepository.findAll();
	}

	@Override
	public ParadaHorario buscarId(String id) {
		return _paradaHorarioRepository.findById(id).orElse(null);
	}

	@Override
	public ParadaHorario insertar(ParadaHorario paradaHorario) {
		return _paradaHorarioRepository.save(paradaHorario);
	}

	@Override
	public void eliminar(String id) {
		_paradaHorarioRepository.deleteById(id);
	}

}
