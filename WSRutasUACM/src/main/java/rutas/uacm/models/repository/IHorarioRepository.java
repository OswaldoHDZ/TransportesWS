package rutas.uacm.models.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import rutas.uacm.models.document.Horario;

public interface IHorarioRepository extends MongoRepository<Horario, String>{

}
