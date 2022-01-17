package edu.it.errores;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RecursoNOEncontradoException extends RuntimeException {
	public RecursoNOEncontradoException() {
		
	}
}
