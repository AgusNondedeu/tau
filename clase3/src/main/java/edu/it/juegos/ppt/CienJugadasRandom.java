package edu.it.juegos.ppt;

import java.util.ArrayList;
import java.util.List;

public class CienJugadasRandom {
	private Jugada jugada;
	private Randomizador randomizador;
	private List<Apuesta> apuestas;
	
	public CienJugadasRandom(Randomizador randomizador, List<Apuesta> apuestas) {
		this.jugada = new Jugada();
		this.randomizador = randomizador;
		this.apuestas = apuestas;
	}

	public void jugar() {
		for (int z : new int[100]) {
			Elemento j1 = randomizador.randomizarElemento();
			Elemento j2 = randomizador.randomizarElemento();
			
			Integer ganador = jugada.jugar(j1, j2);

			for (Apuesta x : apuestas) {
				x.notificar(j1, j2, ganador);
			}
		}
	}
}
