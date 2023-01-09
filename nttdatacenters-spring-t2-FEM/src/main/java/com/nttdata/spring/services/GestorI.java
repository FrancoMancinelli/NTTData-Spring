package com.nttdata.spring.services;

import com.nttdata.spring.repository.Pedidos;
import com.nttdata.spring.repository.Productos;

/**
 * Interfaz de un Servicio, que servirá para gestionar los
 * distintos pedidos y sus productos dependiendo si estos 
 * son enviados dentro o fuera de la peninsula
 * 
 * @author Franco Emanuel Mancinelli
 *
 */
public interface GestorI {

	public void addProductToAnOrder(final Productos product, final Pedidos pedido);
	
	public void breakdownOrder(final Pedidos pedido);
	
	public Pedidos createOrder(final int id, final String destinatario, final String direccion);

}
