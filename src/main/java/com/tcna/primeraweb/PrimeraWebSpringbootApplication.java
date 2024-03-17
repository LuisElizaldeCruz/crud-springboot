package com.tcna.primeraweb;


import com.tcna.primeraweb.entities.Persona;
import com.tcna.primeraweb.repository.PersonaRepository;
import com.tcna.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PrimeraWebSpringbootApplication /*implements CommandLineRunner */{
/*
	@Autowired
	private PersonaService personaService;
*/
	public static void main(String[] args) {
		SpringApplication.run(PrimeraWebSpringbootApplication.class, args);
	}

/*
	@Override
	public void run(String... args) throws Exception {

		personaService.crearPersona(new Persona(5L, "Jose", 26));
		personaService.crearPersona(new Persona(6L, "David", 18));
		personaService.crearPersona(new Persona(7L, "Cristofer", 17));
		personaService.crearPersona(new Persona(8L, "Andres", 18));

		System.out.println("Numero de personas en la tabla : " + personaService.contarPersonas());
		List<Persona> personas = personaService.obtenerTodas();
		personas.forEach(p -> System.out.println("Nombre de la person: " + p.getNombre()));

	}
*/
}
