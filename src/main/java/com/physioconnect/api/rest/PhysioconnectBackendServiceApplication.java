package com.physioconnect.api.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.physioconnect.api.rest.controller")
@EntityScan("com.physioconnect.api.rest.model")
@EnableJpaRepositories("com.physioconnect.api.rest.jpa")
@SpringBootApplication
public class PhysioconnectBackendServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhysioconnectBackendServiceApplication.class, args);
	}

}
