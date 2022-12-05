package rutas.uacm.models.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="parada")
public class Parada {
	@Id
	private String id;
	private String ubicacion;
	private String retraso_minutos;
	private String retraso_espera;
}
