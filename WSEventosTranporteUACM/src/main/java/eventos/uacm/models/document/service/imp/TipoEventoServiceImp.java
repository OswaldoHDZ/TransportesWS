package eventos.uacm.models.document.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eventos.uacm.models.document.TipoEvento;
import eventos.uacm.models.document.service.TipoEventoService;
import eventos.uacm.models.repository.ITipoEventoRepository;

@Service
public class TipoEventoServiceImp implements TipoEventoService{
	
	@Autowired
	ITipoEventoRepository tipoEventoRepository;
	
	@Override
	public List<TipoEvento> obtenerTodos() {
		return tipoEventoRepository.findAll();
	}

	@Override
	public TipoEvento buscarId(String id) {
		return tipoEventoRepository.findById(id).orElse(null);
	}

	@Override
	public TipoEvento insertar(TipoEvento eventoTransporte) {
		return tipoEventoRepository.save(eventoTransporte);
	}

	@Override
	public void eliminar(String id) {
		tipoEventoRepository.deleteById(id);
		
	}

}
