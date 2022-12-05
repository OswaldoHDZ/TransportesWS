package eventos.uacm.models.document.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eventos.uacm.models.document.EventoTransporte;
import eventos.uacm.models.document.service.IEventoTransporteService;
import eventos.uacm.models.repository.IEventoTransporteRepository;


@Service
public class EventoTransporteServiceImpl implements IEventoTransporteService{

	@Autowired
	IEventoTransporteRepository eventoTransporteRepository;
	@Override
	public List<EventoTransporte> obtenerTodos() {
		
		return eventoTransporteRepository.findAll();
	}

	@Override
	public EventoTransporte buscarId(String id) {
		
		return eventoTransporteRepository.findById(id).orElse(null);
	}

	@Override
	public EventoTransporte insertar(EventoTransporte eventoTransporte) {
		
		return eventoTransporteRepository.save(eventoTransporte);
	}

	@Override
	public void eliminar(String id) {
		eventoTransporteRepository.deleteById(id);
		
	}


}