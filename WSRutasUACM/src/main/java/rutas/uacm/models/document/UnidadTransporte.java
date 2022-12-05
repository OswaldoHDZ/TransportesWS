package rutas.uacm.models.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="unidad_transporte")
public class UnidadTransporte {
	@Id
	private String id;
	private String tipo_transporte_id;
	private String numero_economico;
	private String numero_asientos;
	private String id_ruta;
}
