package rutas.uacm.models.document;

import java.sql.Time;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Data
@Document(collection="horario")
public class Horario {
	@Id
	private String id;
	private Date fecha;
	private Time hora_llegada;
	private Time hora_partida;
	private String info_adicional;
}