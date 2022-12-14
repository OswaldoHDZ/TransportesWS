package rutas.uacm.models.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rutas.uacm.models.document.TipoTransporte;
import rutas.uacm.models.repository.ITipoTransporteRepository;
import rutas.uacm.models.service.ITipoTransporteService;


@Service
public class TipoTransporteServiceImp implements ITipoTransporteService{
	@Autowired
	ITipoTransporteRepository _tipoTransporteRepository;
	@Override
	public List<TipoTransporte> obtenerTodos() {
		return _tipoTransporteRepository.findAll();
	}

	@Override
	public TipoTransporte buscarId(String id) {
		return _tipoTransporteRepository.findById(id).orElse(null);
	}

	@Override
	public TipoTransporte insertar(TipoTransporte tipoTransporte) {
		return _tipoTransporteRepository.save(tipoTransporte);
	}

	@Override
	public void eliminar(String id) {
		_tipoTransporteRepository.deleteById(id);
	}


}