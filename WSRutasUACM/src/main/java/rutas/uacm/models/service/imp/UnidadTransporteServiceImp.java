package rutas.uacm.models.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rutas.uacm.models.document.UnidadTransporte;
import rutas.uacm.models.repository.IUnidadTransporteRepository;
import rutas.uacm.models.service.IUnidadTransporteService;

@Service
public class UnidadTransporteServiceImp implements IUnidadTransporteService{
	
	@Autowired
	IUnidadTransporteRepository _unidadTransporteRepository;
	
	@Override
	public List<UnidadTransporte> obtenerTodos() {
		return _unidadTransporteRepository.findAll();
	}

	@Override
	public UnidadTransporte buscarId(String id) {
		return _unidadTransporteRepository.findById(id).orElse(null);
	}

	@Override
	public UnidadTransporte insertar(UnidadTransporte unidadTransporte) {
		return _unidadTransporteRepository.save(unidadTransporte);
	}

	@Override
	public void eliminar(String id) {
		_unidadTransporteRepository.deleteById(id);
	}

}
