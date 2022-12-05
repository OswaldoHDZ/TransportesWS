package eventos.uacm.models.document;

import java.sql.Time;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
@Data
@Document(collection="eventos_transporte")
public class EventoTransporte {
	@Id
	private String id;
	private Integer tipoEvento;
	private String descripcionEvento;
	@CreatedDate
	private Date fecha;
	private Time hora;
	@Field("info_adicional")
	private String infoAdicional;
	private String estudiante;
	
}