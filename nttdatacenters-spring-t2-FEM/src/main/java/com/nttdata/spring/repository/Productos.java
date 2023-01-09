package com.nttdata.spring.repository;

/**
 * Clase que simula un Producto
 * 
 * @author Franco Emanuel Mancinelli
 *
 */
public class Productos {

	/** ID del producto */
	private int id;
	
	/** Nombre del producto */
	private String nombre;
	
	/** Precio con impuestos aplicados del producto */
	private double precioPVP;
	
	/** Precio base/inicial del producto */
	private double precioNormal;

	/**
	 * Constructor de un Producto
	 * @param id ID del producto
	 * @param nombre Nombre del producto
	 * @param precioNormal Precio base/inicial del producto
	 */
	public Productos(int id, String nombre, double precioNormal) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precioNormal = precioNormal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioPVP() {
		return precioPVP;
	}

	public void setPrecioPVP(double precioPVP) {
		this.precioPVP = precioPVP;
	}

	public double getPrecioNormal() {
		return precioNormal;
	}

	public void setPrecioNormal(double precioNormal) {
		this.precioNormal = precioNormal;
	}

	// ToString
	@Override
	public String toString() {
		return "Productos [id=" + id + ", nombre=" + nombre + ", precioPVP=" + Math.round(precioPVP * 100.0) / 100.0
				+ ", precioNormal=" + precioNormal + "]";
	}

}
