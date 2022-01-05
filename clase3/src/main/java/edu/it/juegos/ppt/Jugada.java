package edu.it.juegos.ppt;

import edu.it.juegos.ppt.*;

public class Jugada {
	public Integer jugar(Elemento opcionJugador1, Elemento opcionJugador2) {
		if (opcionJugador1 == opcionJugador2) {
			return 0;
		}
		if (opcionJugador1 == Elemento.PIEDRA && opcionJugador2 == Elemento.PAPEL) {
			return 2;
		}
		if (opcionJugador1 == Elemento.PIEDRA && opcionJugador2 == Elemento.TIJERA) {
			return 1;
		}
		if (opcionJugador1 == Elemento.PAPEL && opcionJugador2 == Elemento.TIJERA) {
			return 2;
		}
		if (opcionJugador1 == Elemento.PAPEL && opcionJugador2 == Elemento.PIEDRA) {
			return 1;
		}
		if (opcionJugador1 == Elemento.TIJERA && opcionJugador2 == Elemento.PIEDRA) {
			return 2;
		}
		if (opcionJugador1 == Elemento.TIJERA && opcionJugador2 == Elemento.PAPEL) {
			return 1;
		}
		throw new RuntimeException("Nunca deberia llegar a este punto");
	}
}
