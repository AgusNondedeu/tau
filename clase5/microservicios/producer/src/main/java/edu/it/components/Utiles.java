package edu.it.components;

import java.util.UUID;

import org.springframework.stereotype.Component;
import com.github.javafaker.Faker;

import edu.it.entities.Alumno;

@Component
public class Utiles {
	public String getCurrentSecondsAsString() {
		return new String().valueOf(getCurrentSeconds());
	}
	public Long getCurrentSeconds() {
		return System.currentTimeMillis() / 1000;
	}
	public static Alumno generarAlumnoRandom() {
		Faker fkr = new Faker();
		
		return new Alumno(
				UUID.randomUUID().toString(),
	            fkr.address().firstName(),
	            fkr.address().lastName(),
	            fkr.address().streetName(),
	            fkr.address().streetAddressNumber(),
	            fkr.address().state(),
	            fkr.address().country()
	        );
	}
}
