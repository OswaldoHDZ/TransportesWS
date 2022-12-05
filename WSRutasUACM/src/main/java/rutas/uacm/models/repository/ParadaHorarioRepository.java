package rutas.uacm.models.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import rutas.uacm.models.document.ParadaHorario;


public interface ParadaHorarioRepository extends MongoRepository<ParadaHorario, String>{

}
