package com.nttdata.spring.services;

import org.springframework.stereotype.Service;

import com.nttdata.spring.repository.Pedidos;
import com.nttdata.spring.repository.Productos;

/**
 * Servicio que implementa la interfaz GestorI que contiene
 * los métodos necesarios gestionar productos y pedidos que
 * seran enviados dentro de la peninsula
 * 
 * @author Franco Emanuel Mancinelli
 *
 */
@Service("gestorPeninsularService")
public class GestorPeninsularImpl implements GestorI {

	/**
	 * Calcula el precio PVP de un producto enviado dentro de la peninsula
	 */
	public void addProductToAnOrder(Productos product, Pedidos pedido) {
		double iva = 0.21;
		double precioBase = product.getPrecioNormal();
		double precioIVA = precioBase + (precioBase * iva);
		product.setPrecioPVP(precioIVA);	
		pedido.getProductos().add(product);
	}

	/**
	 * Muestra los productos de una orden
	 */
	public void breakdownOrder(Pedidos pedido) {
		System.out.println("--------------------");
		System.out.println("Pedido número: " + pedido.getId());

		for(Productos p : pedido.getProductos()) {
			System.out.println(p.toString());
		}
	}

	/**
	 * Crea un nuevo pedido PENINSULAR
	 */
	public Pedidos createOrder(int id, String destinatario, String direccion) {
		return new Pedidos(id, destinatario, direccion, true);		
	}
	
}
