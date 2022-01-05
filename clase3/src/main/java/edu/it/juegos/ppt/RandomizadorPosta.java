package edu.it.juegos.ppt;

import java.util.Random;

public class RandomizadorPosta implements Randomizador {
	public Elemento randomizarElemento() {
		Integer r = new Random().nextInt(300);
		r = Math.abs(r);
		
		if (r % 3 == 0) {
			return Elemento.PIEDRA;
		}
		if (r % 3 == 1) {
			return Elemento.PAPEL;
		}
		if (r % 3 == 2) {
			return Elemento.TIJERA;
		}
		
		throw new RuntimeException("Guarda que nunca deberia llegar a aqui");
	}
}
