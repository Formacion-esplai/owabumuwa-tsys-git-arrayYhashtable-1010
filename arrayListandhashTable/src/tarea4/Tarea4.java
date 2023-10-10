package tarea4;

import java.util.Hashtable;
import java.util.Scanner;

import tarea2.Tarea2;
import tarea3.Tarea3;

public class Tarea4 {
	


	public static void main(String[] args) {
		
		 
		 Hashtable<String, Double> products  = new Hashtable<>();

	    	Scanner scanner = new Scanner(System.in);
	    	
	    	 Tarea2 productoControlador = new Tarea2();
			 Tarea3 productoCreardor = new Tarea3();
			 System.out.println("Es recomendable pausar(con la opcion 4)después de crear cada producto para calcular el IVA, el cambio del cliente y sumarlo al precio");

			 while(true) {

				    double price = productoCreardor.agregarProducto(products, scanner);
				    System.out.println(price);

					
					System.out.println("Escribe la tasa de impuesto (4% o 21%): ");
					int ivaToSelect = scanner.nextInt();
			
					double valeAfterIva = productoControlador.getValueAfterIVA(ivaToSelect, price);
					
					double priceAfterTax = productoControlador.getTotalPriceOfProductAfterTax(price, valeAfterIva) ;
					
					System.out.println("Cuial es el precio pagado por el producto");
					double precioPagadoPorProducto = scanner.nextInt();
					precioPagadoPorProducto = productoControlador.getcambioDelCliente(precioPagadoPorProducto, priceAfterTax);
			 }
			 
				
					 
		 
	 }

}
