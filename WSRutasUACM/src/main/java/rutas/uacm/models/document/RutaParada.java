package rutas.uacm.models.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="ruta_parada")
public class RutaParada {
	
	@Id
	private String id;
	private String id_ruta;
	private String id_parada;
}
