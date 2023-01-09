package com.nttdata.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import com.nttdata.spring.repository.Pedidos;
import com.nttdata.spring.repository.Productos;
import com.nttdata.spring.services.GestorI;

/**
 * Clase principal del proyecto
 * 
 * @author Franco Emanuel Mancinelli
 *
 */
@SpringBootApplication()
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class MainApp implements CommandLineRunner {

	@Autowired
	@Qualifier("gestorPeninsularService")
	private GestorI servicioPeninsular;

	@Autowired
	@Qualifier("gestorNoPeninsularService")
	private GestorI servicioNoPeninsular;

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
	}

	public void run(String... args) throws Exception {

		// Creación de productos
		Productos produ1 = new Productos(1, "Queso", 4.44);
		Productos produ2 = new Productos(2, "Jamón", 5.12);
		Productos produ3 = new Productos(3, "Melon", 1.36);
		Productos produ4 = new Productos(4, "Leche", 3.28);
		Productos produ5 = new Productos(5, "Carne", 7.89);
		
		// Creación de pedidos
		Pedidos pedi1 = servicioNoPeninsular.createOrder(1, "Cristina", "Calle Marineros, Ceuta");
		Pedidos pedi2 = servicioPeninsular.createOrder(2, "Antonio", "Calle Picasso, Malaga");

		// Enlistamos los pedidos para iterarlos
		List<Pedidos> listaPedidos = new ArrayList<Pedidos>();
		listaPedidos.add(pedi1);
		listaPedidos.add(pedi2);
		
		// Por cada pedido, agregamos todos los productos
		for (Pedidos pedido : listaPedidos) {
			
			// Si el pedido es peninsular...
			if(pedido.isPeninsula()) {
				servicioPeninsular.addProductToAnOrder(produ1, pedido);
				servicioPeninsular.addProductToAnOrder(produ2, pedido);
				servicioPeninsular.addProductToAnOrder(produ3, pedido);
				servicioPeninsular.addProductToAnOrder(produ4, pedido);
				servicioPeninsular.addProductToAnOrder(produ5, pedido);
				
				//Vemos los productos del pedido
				servicioPeninsular.breakdownOrder(pedido);
			} else {
				servicioNoPeninsular.addProductToAnOrder(produ1, pedido);
				servicioNoPeninsular.addProductToAnOrder(produ2, pedido);
				servicioNoPeninsular.addProductToAnOrder(produ3, pedido);
				servicioNoPeninsular.addProductToAnOrder(produ4, pedido);
				servicioNoPeninsular.addProductToAnOrder(produ5, pedido);
				
				//Vemos los productos del pedido
				servicioNoPeninsular.breakdownOrder(pedido);

			}
		}
	}

}
