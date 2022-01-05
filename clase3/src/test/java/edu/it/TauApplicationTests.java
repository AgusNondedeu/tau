package edu.it;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import edu.it.juegos.ppt.Apuesta;
import edu.it.juegos.ppt.CienJugadasRandom;
import edu.it.juegos.ppt.Elemento;
import edu.it.juegos.ppt.Jugada;
import edu.it.juegos.ppt.Randomizador;

class RandomizadorFicticio implements Randomizador {
	public Elemento randomizarElemento() {
		return Elemento.PIEDRA;
	}
}

@SpringBootTest(classes=java.util.Date.class)
class TauApplicationTests {

	@Test
	void contextLoads() {
		// AAA
		// Arrange - Tipicamente ordenar los objetos que van a participar en el test
		// Act - llamar a o los metodos involucrados
		// Assert - Evaluarlos resultados
	}
	@Test
	void ganaPiedraSobreTijera() {
		// Arrange
		Elemento j1 = Elemento.PIEDRA;
		Elemento j2 = Elemento.TIJERA;
		var jugada = new Jugada();
		
		// Act
		var resultado = jugada.jugar(j1, j2);
		
		// Assert
		Assert.isTrue(resultado == 1, "Atencion que deberia haber ganado piedra sobre tijera");
	}
	@Test
	void pruebaApuestas() {
		// Arrange
		Randomizador randm = new RandomizadorFicticio();
		ArrayList<Apuesta> apuestas = new ArrayList<Apuesta>();
		// apuestas.add(x, y z -> {});
		CienJugadasRandom cienJugadasRandom = new CienJugadasRandom(randm, apuestas);
		
		// Act
		cienJugadasRandom.jugar();
		
		// Assert
		/*
		 * Todo lo que hay que pensar
		 * 1) Randomizador ficticio proveerle de numeros que nos sirvan para un caso de uso 
		 * 2) Deben existir Sistemas de apuestas (Tantos como se permita la creatividad)
		 * 3) Utilizar un framework como Mockito para no tener que escribir todos los
		 *    randomizables ficitcios.
		 */
		
		 Assert.isTrue(randm.randomizarElemento() == Elemento.PIEDRA, "Guarda que esta mal...");
	}
}
