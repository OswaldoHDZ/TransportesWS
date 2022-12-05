package rutas.uacm.models.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="parada_horario")
public class ParadaHorario {
	@Id
	private String id;
	private String parada_id;
	private String horario_id;
	private String info_adicional;
}
