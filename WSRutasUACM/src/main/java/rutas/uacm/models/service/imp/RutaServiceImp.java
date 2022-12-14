package rutas.uacm.models.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rutas.uacm.models.document.Ruta;
import rutas.uacm.models.repository.IRutaRepository;
import rutas.uacm.models.service.IRutaService;

@Service
public class RutaServiceImp implements IRutaService{
	@Autowired
	IRutaRepository _rutaRepository;
	
	@Override
	public List<Ruta> obtenerTodos() {
		return _rutaRepository.findAll();
	}

	@Override
	public Ruta buscarId(String id) {
		return _rutaRepository.findById(id).orElse(null);
	}

	@Override
	public Ruta insertar(Ruta ruta) {
		return _rutaRepository.save(ruta);
	}

	@Override
	public void eliminar(String id) {
		_rutaRepository.deleteById(id);
	}

}
