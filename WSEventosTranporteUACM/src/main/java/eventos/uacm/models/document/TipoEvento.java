package eventos.uacm.models.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="tipo_evento")
public class TipoEvento {
	@Id
	private String id;
	private String nombre;
}
