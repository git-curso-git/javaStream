package eci.seguros.webs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aplicacion {

	public static void main(String[] args) {
		System.out.format("%-20s : %06x\n", "Hola, soy yo", 155);
		System.out.format("%20s y a continuaci�n un n�mero %d\n", "Hola, soy yo", 155);
		
		SpringApplication.run(Aplicacion.class, args);
	}
}
