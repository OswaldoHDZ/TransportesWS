package rutas.uacm.models.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="ruta")
public class Ruta {
	@Id
	private String id;
	private String ubicacion_origen;
	private String ubicacion_destino;
	private String horario_origen;
	private String horario_destino;
}