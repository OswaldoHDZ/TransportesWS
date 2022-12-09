package reservaciones.uacm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class WsReservacionesUacmApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsReservacionesUacmApplication.class, args);
	}

}
