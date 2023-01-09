package com.nttdata.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Clase Interfaz a modo de Repositorio de Clientes
 * 
 * @author Franco Emanuel Mancinelli
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	/**
	 * Método encargado de buscar y devolver una lista con todos
	 * los clientes que tengan el nombre especificado
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
	public List<Cliente> findByApellidos(final String apellidos);
}
