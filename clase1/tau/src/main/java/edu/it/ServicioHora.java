package edu.it;

import javax.mispec.menu.MenuItem;

public class ServicioHora implements MenuItem {
	public void ejecutarOpcionMenu() {
		System.out.println("Ejecutando Servicio Hora .... en miliseconds");
		System.out.println(System.currentTimeMillis());
	}
}
