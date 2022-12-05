package eventos.uacm.models.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import eventos.uacm.models.document.EventoTransporte;


public interface IEventoTransporteRepository extends MongoRepository<EventoTransporte, String>{

}
