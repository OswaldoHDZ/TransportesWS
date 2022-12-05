package rutas.uacm.models.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import rutas.uacm.models.document.Ruta;

public interface IParadaRepository extends MongoRepository<Ruta, String>{

}
