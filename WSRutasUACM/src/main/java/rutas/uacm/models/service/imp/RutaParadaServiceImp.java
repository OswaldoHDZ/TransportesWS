package rutas.uacm.models.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rutas.uacm.models.document.RutaParada;
import rutas.uacm.models.repository.RutaParadaRepository;
import rutas.uacm.models.service.IRutaParadaService;
@Service
public class RutaParadaServiceImp implements IRutaParadaService{

	@Autowired
	RutaParadaRepository _rutaParadaRepository;

	@Override
	public List<RutaParada> obtenerTodos() {
		return _rutaParadaRepository.findAll();
	}

	@Override
	public RutaParada buscarId(String id) {
		return _rutaParadaRepository.findById(id).orElse(null);
	}

	@Override
	public RutaParada insertar(RutaParada rutaParada) {
		return _rutaParadaRepository.save(rutaParada);
	}

	@Override
	public void eliminar(String id) {
		_rutaParadaRepository.deleteById(id);
	}

	


}
