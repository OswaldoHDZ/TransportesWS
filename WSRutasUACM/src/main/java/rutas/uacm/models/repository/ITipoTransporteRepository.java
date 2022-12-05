package rutas.uacm.models.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import rutas.uacm.models.document.TipoTransporte;

public interface ITipoTransporteRepository extends MongoRepository<TipoTransporte, String> {

}
