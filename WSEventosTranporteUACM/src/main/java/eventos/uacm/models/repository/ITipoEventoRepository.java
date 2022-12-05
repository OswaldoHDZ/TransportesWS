package eventos.uacm.models.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import eventos.uacm.models.document.TipoEvento;

public interface ITipoEventoRepository extends MongoRepository<TipoEvento, String>{

}
