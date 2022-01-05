package edu.it;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import edu.it.juegos.ppt.Elemento;
import edu.it.juegos.ppt.Jugada;

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
}
