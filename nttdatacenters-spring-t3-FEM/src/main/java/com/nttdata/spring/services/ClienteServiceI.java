package com.nttdata.spring.services;

import java.util.List;

import com.nttdata.spring.repository.Cliente;

/**
 * Interfaz de un Cliente, que servirá para gestionar las distintas consultas en
 * la base de datos
 * 
 * @author Franco Emanuel Mancinelli
 *
 */
public interface ClienteServiceI {

	/**
	 * Método encargado de buscar y devolver una lista con todos los clientes que
	 * tengan el nombre especificado
	 * 
	 * @param nombre Nombre a buscar
	 * @return El listado de clientes con el nombre especificado por parametro
	 */
	public List<Cliente> findByNombre(final String nombre);

	/**
	 * Método encargado de buscar y devolver una lista con todos los clientes que
	 * tengan los apellidos especificados
	 * 
	 * @param apellidos Apellidos a buscar
	 * @return El listado de clientes con los apellidos especificado por parametro
	 */
	public List<Cliente> findByApellidos(String apellidos);
}