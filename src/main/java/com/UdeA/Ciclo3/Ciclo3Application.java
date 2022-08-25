package com.UdeA.Ciclo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class Ciclo3Application {

	@GetMapping("/hello")
	public String hello(){
		return "Hola Ciclo3 .... Saldremos vivos de esto!";
	}

	@GetMapping("/test")
	public String test(){
		Empresa emp = new Empresa("SOLAR SAS", "Calle La geta",  "31212312233", "800123555");
		emp.setNombre("SOLAR Punto NET");
		return emp.getNombre();
	}

	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);
	}

}
