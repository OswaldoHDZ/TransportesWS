package rutas.uacm.models.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import rutas.uacm.models.document.RutaParada;


public interface RutaParadaRepository extends MongoRepository<RutaParada, String>{

}
