package com.nttdata.spring.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que simula un Cliente
 *
 * @author Franco Emanuel Mancinelli
 */
@Entity
@Table(name = "TABLE_CLIENTS")
public class Cliente {

	/** ID del cliente */
	private Long id;

	/** Nombre del cliente */
	private String nombre;

	/** Apellidos del cliente */
	private String apellidos;

	/** Fecha de nacimiento del cliente */
	private String fechaNacimiento;

	/** DNI del cliente */
	private String dni;

	/* Constructor vacio de Cliente */
	public Cliente() {
		super();
	}

	/* Constructor con atributos de Cliente */
	public Cliente(String nombre, String apellidos, String fechaNacimiento, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CLIENTE_ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "NOMBRE")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "APELLIDOS")
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Column(name = "NACIMIENTO")
	public String getfechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Column(name = "DNI")
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	// ToString
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ fechaNacimiento + ", dni=" + dni + "]";
	}

}
