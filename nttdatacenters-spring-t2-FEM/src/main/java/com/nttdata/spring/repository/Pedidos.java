package com.nttdata.spring.repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que simula un Pedido
 * 
 * @author Franco Emanuel Mancinelli
 *
 */
public class Pedidos {

	/** ID del pedido */
	private int id;

	/** Nombre del destinatario del pedido */
	private String destinatario;
	
	/** Dirección de envio del pedido */
	private String direccion;
	
	/** Si el envio es dentro de la peninsula (true) o no (false) */
	private boolean peninsula;
	
	/** Listado de productos que contiene el pedido */
	private List<Productos> productos;

	/**
	 * Constructor de un Pedido
	 * 
	 * @param id ID Del pedido
	 * @param destinatario Nombre del destinatario
	 * @param direccion La dirección de entrega
	 * @param peninsula True si el envio es dentro de la peninsula | False en caso contrario
	 */
	public Pedidos(int id, String destinatario, String direccion, boolean peninsula) {
		super();
		this.id = id;
		this.destinatario = destinatario;
		this.direccion = direccion;
		this.peninsula = peninsula;
		this.productos = new ArrayList<Productos>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean isPeninsula() {
		return peninsula;
	}

	public void setPeninsula(boolean peninsula) {
		this.peninsula = peninsula;
	}

	public List<Productos> getProductos() {
		return productos;
	}

	public void setProductos(List<Productos> productos) {
		this.productos = productos;
	}

	// ToString
	@Override
	public String toString() {
		return "Pedidos [id=" + id + ", destinatario=" + destinatario + ", direccion=" + direccion + ", peninsula="
				+ peninsula + ", productos=" + productos + "]";
	}

}
