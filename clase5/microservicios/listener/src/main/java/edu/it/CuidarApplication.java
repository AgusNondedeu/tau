package edu.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class CuidarApplication {

	public static void main(String[] args) {
		SpringApplication.run(CuidarApplication.class, args);
	}

}
