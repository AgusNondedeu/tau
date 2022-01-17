package edu.it.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import edu.it.components.Utiles;
import edu.it.entities.Alumno;
import edu.it.errores.InternalServerError;
import edu.it.errores.NotFoundException;
import edu.it.repository.AlumnoRepository;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/alumno")
@Slf4j
public class AlumnoController {
	
	@Autowired
	Utiles utiles;
	
	@Autowired
	AlumnoRepository alumnoRepository;
	
	@RequestMapping(path="/instancia", method=RequestMethod.GET)
	public Object obtenerInstancia() {
		HashMap<String, String> mapa = new HashMap<String, String>();
		
		mapa.put("nombreInstancia", System.getenv("instancia"));
		
		return mapa;
	}
	
	@RequestMapping(path="/inventar", method=RequestMethod.GET)
	public Alumno inventarAlumno() {
		return utiles.generarAlumnoRandom();
	}
	
	@GetMapping(path="/{id}")
	public Alumno obtenerUnAlumno(@PathVariable("id") String id) {
		Optional<Alumno> optAlu;
		
		try {
			optAlu = alumnoRepository.findById(id);
		}
		catch (Exception ex) {
			throw new InternalServerError("hubo un error en la base de datos");
		}
		
		if (optAlu.isEmpty()) {
			throw new NotFoundException();
		}
		
		return optAlu.get();
	}
	
	@GetMapping
	public List<Alumno> obtenerMuchosAlumnos() { 
		try {
			return alumnoRepository.findAll();
		} 
		catch (Exception ex) {
			throw new InternalServerError("");
		}
	}
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void insertarAlumno(@RequestBody Alumno alumno) {
		try {
			log.info("se procede a insertar un alumno");
			alumnoRepository.save(alumno);
		}
		catch (Exception ex) {
			log.error("No se pudo escribir en la base de datos");
			log.error(ex.getMessage());
		}
	}
	
	public void modificarAlumno() {}
	
	public void borrarAlumno() {}
}
