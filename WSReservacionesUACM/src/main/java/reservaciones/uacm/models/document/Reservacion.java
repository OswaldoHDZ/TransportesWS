package reservaciones.uacm.models.document;

import java.time.LocalTime;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="reservacion")
public class Reservacion {
	@Id
	private String id;
	private Date fecha;
	private LocalTime hora;
	private String estudiante_Id;
	private String rutaId;
	private String paradaId;
}