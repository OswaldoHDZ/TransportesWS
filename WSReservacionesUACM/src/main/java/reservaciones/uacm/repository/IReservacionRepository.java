package reservaciones.uacm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import reservaciones.uacm.models.document.Reservacion;

public interface IReservacionRepository extends MongoRepository<Reservacion, String>{

}
