package com.nttdata.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal del proyecto
 * 
 * @author Franco Emanuel Mancinelli
 *
 */
@SpringBootApplication()
public class MainApp implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
	}

	public void run(String... args) throws Exception {
	}
}
