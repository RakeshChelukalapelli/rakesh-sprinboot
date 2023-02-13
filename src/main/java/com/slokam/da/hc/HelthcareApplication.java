package com.slokam.da.hc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class HelthcareApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelthcareApplication.class, args);
		
	
	}
}

