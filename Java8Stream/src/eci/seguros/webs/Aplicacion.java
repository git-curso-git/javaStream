package eci.seguros.webs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication // ya incluye @EnableAutoConfiguration
public class Aplicacion {
	
	private static final Logger logger = LoggerFactory.getLogger(Aplicacion.class);

	public static void main(String[] args) {
		System.out.format("%-20s : %06x\n", "Hola, soy yo", 155);
		System.out.format("%20s y a continuaci�n un n�mero %d\n", "Hola, soy yo", 155);
		
		logger.info("arrancando spring boot");
		SpringApplication.run(Aplicacion.class, args);
	}
}
