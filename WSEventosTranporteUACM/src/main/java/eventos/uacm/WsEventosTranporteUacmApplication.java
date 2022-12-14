package eventos.uacm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.core.MongoTemplate;

import eventos.uacm.models.document.EventoTransporte;
import eventos.uacm.models.document.service.IEventoTransporteService;
@EnableEurekaClient
@SpringBootApplication
public class WsEventosTranporteUacmApplication implements CommandLineRunner{
	
	
	@Autowired 
	MongoTemplate mongo;
	
	@Autowired
	IEventoTransporteService _eventoTransporteService;
	
	public static void main(String[] args) {
		SpringApplication.run(WsEventosTranporteUacmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		EventoTransporte et1 = new EventoTransporte();
		et1.setTipoEvento(1);
		et1.setDescripcionEvento("SUBIDA");
		et1.setInfoAdicional("no presento credencial");
		et1.setEstudiante( "1234567" );
		this._eventoTransporteService.insertar(et1);

	}

}
