package com.nttdata.spring.services;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.spring.repository.Cliente;
import com.nttdata.spring.repository.ClienteRepository;

/**
 * Servicio que implementa la interfaz ClienteServiceI que contiene los métodos
 * necesarios gestionar las consultas de Clientes
 * 
 * @author Franco Emanuel Mancinelli
 *
 */
@Service("clienteService")
public class ClienteServiceImpl implements ClienteServiceI {

	@Autowired
	private ClienteRepository clienteRepository;

	/**
	 * Consulta todos los clientes con un determinado nombre
	 */
	public List<Cliente> findByNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			return clienteRepository.findByNombre(nombre);
		}

		return Collections.emptyList();
	}

	/**
	 * Consulta todos los clientes con un determinado apellido
	 */
	public List<Cliente> findByApellidos(String apellidos) {

		if (apellidos != null && !apellidos.isBlank()) {
			return clienteRepository.findByApellidos(apellidos);
		}
		return Collections.emptyList();
	}

}