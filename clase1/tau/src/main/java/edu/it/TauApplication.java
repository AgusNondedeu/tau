package edu.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bolivarsoft.components.MenuFileSystem;

@SpringBootApplication
public class TauApplication {
	public static void main(String[] args) {
		MenuFileSystem.crearMenu().mostrarMenu();
	}
}
