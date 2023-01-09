package com.nttdata.spring.restControllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.spring.repository.Cliente;

/**
 * RestController de Cliente
 * 
 * @author Franco Emanuel Mancinelli
 */
@RestController
@RequestMapping("/home/clientes")
public class ClienteRestController {

	private Map<Long, Cliente> mapa;


	public ClienteRestController() {

		mapa = new HashMap<>();
		
		mapa.put(1L, new Cliente("Antonio", "Anchon", "19/11/1950", "11111111A"));
		mapa.put(2L, new Cliente("Bruno", "Barroco", "25/12/2000", "22222222B"));
		mapa.put(3L, new Cliente("Carlos", "Coral", "20/02/2002", "33333333C"));
		mapa.put(4L, new Cliente("Dolores", "Duran", "10/10/1910", "44444444D"));
	}

	/**
	 * Método rest que agrega a un nuevo cliente
	 * 
	 * @param cliente El nuevo cliente a agregar
	 */
	@PostMapping
	public void addClient(@RequestBody Cliente cliente) {
		mapa.put(cliente.getId(), cliente);
	}
	
	/**
	 * Método rest que devuelve los clientes
	 * 
	 * @return Un Map con los clientes
	 */
	@GetMapping
	public Map<Long, Cliente> getClientsList() {
		return mapa;
	}
	
	/**
	 * Método rest que devuelve los clientes con una ID especifica
	 * 
	 * @param id El ID del cliente a buscar
	 * @return Cliente El cliente con esa ID
	 */
	@RequestMapping(path = "/cliente", method = RequestMethod.GET, consumes = "application/json")
	public Cliente searchById(@RequestBody Long id) {
		return mapa.get(id);
	}

	/**
	 * Método rest que elimina un cliente
	 * 
	 * @param id El ID del cliente a eliminar
	 */
	@DeleteMapping(value = "/{id}")
	public void deleteClient(final @PathVariable Long id) {
		mapa.remove(id);
	}


}