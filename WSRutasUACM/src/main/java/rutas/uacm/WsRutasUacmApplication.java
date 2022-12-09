package rutas.uacm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class WsRutasUacmApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsRutasUacmApplication.class, args);
	}

}
