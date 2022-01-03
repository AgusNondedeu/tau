package edu.it;

import javax.mispec.menu.MenuItem;

public class ServicioHora implements MenuItem {
	public void ejecutarOpcionMenu() {
		System.out.println("Ejecutando Servicio Hora");
		System.out.println(System.currentTimeMillis());
	}
}
