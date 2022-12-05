package rutas.uacm.models.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import rutas.uacm.models.document.UnidadTransporte;

public interface IUnidadTransporteRepository extends MongoRepository<UnidadTransporte, String>{

}
