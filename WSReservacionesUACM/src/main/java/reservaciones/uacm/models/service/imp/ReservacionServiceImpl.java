package reservaciones.uacm.models.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reservaciones.uacm.models.document.Reservacion;
import reservaciones.uacm.models.service.IReservacionService;
import reservaciones.uacm.repository.IReservacionRepository;

@Service
public class ReservacionServiceImpl implements IReservacionService{
	@Autowired
	IReservacionRepository reservacionRepository;

	@Override
	public List<Reservacion> obtenerTodos() {
		return reservacionRepository.findAll();
	}

	@Override
	public Reservacion buscarId(String id) {
		return reservacionRepository.findById(id).orElse(null);
	}

	@Override
	public Reservacion insertar(Reservacion pReservacion) {
		return reservacionRepository.save(pReservacion);
	}

	@Override
	public void eliminar(String id) {
		reservacionRepository.deleteById(id);
	}
}