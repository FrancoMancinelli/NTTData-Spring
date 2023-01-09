package com.nttdata.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.repository.Cliente;
import com.nttdata.spring.repository.ClienteRepository;
import com.nttdata.spring.services.ClienteServiceI;

/**
 * Clase principal del proyecto
 * 
 * @author Franco Emanuel Mancinelli
 *
 */
@SpringBootApplication()
public class MainApp implements CommandLineRunner {

	@Autowired
	@Qualifier("clienteService")
	private ClienteServiceI clientService;
	
	@Autowired
	private ClienteRepository clientes;

	/**
	 * Método main del proyecto
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
	}

	public void run(String... args) throws Exception {

		//Creamos y guardamos en nuestra "base de datos" a los siguientes 4 clientes
		clientes.save(new Cliente("Antonio", "Anchon", "19/11/1950", "11111111A"));
		clientes.save(new Cliente("Bruno", "Barroco", "25/12/2000", "22222222B"));
		clientes.save(new Cliente("Carlos", "Coral", "20/02/2002", "33333333C"));
		clientes.save(new Cliente("Dolores", "Duran", "10/10/1910", "44444444D"));
		
		//Realizamos consultas
		System.out.println("Clientes con el nombre Antonio: " + clientService.findByNombre("Antonio"));
		System.out.println("Clientes con el apellido Coral: " + clientService.findByApellidos("Coral"));

	}
}
