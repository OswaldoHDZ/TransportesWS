package com.uacm.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerUacmApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerUacmApplication.class, args);
	}

}
