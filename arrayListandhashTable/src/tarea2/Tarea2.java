package tarea2;

import java.util.Hashtable;
import java.util.Scanner;

public class Tarea2 {

	public void controlProduct(Hashtable<String, Hashtable<String, Double>> products, Scanner scanner) {
       

        
        while(true) {
			System.out.println("Escribe el nombre de articulo");
			String productNameToWrite= scanner.nextLine();
			
			
			
			if(productNameToWrite.equals("stop")) {
				break;
			}	
			
			else {
				
				
				System.out.println("Escribe la cantidad de articulo");
				Double productQuantityToWrite= scanner.nextDouble();

				
				System.out.println("Escribe el precio de articulo");
				Double productPriceToWrite = scanner.nextDouble();
				
                Hashtable<String, Double> productInfo = new Hashtable<>();
                productInfo.put("price", productPriceToWrite);
                productInfo.put("quantity", productQuantityToWrite);
                
                products.put(productNameToWrite, productInfo);
                
                //System.out.println("Test arrayy" + products);
                System.out.println("Lista de productos" + products);
                
				 
			    double totalPriceOfProducts = calculateTotalPrice(productPriceToWrite, productQuantityToWrite); 
			   
			    
				 
				System.out.println("Escribe la tasa de impuesto (4% o 21%): ");
				int ivaToSelect = scanner.nextInt();
				
				
				double valueAfterIva = getValueAfterIVA(ivaToSelect, totalPriceOfProducts);
				
				
				
				double totalPriceOfProductAfterTax = getTotalPriceOfProductAfterTax(totalPriceOfProducts, valueAfterIva);
				System.out.println("precio final despues de IVA is"+ totalPriceOfProductAfterTax );
				
				System.out.println("Cual es el precio pagado por el producto");
				
				double precioPagadoPorProducto = scanner.nextInt();
				
				precioPagadoPorProducto = getcambioDelCliente(precioPagadoPorProducto, totalPriceOfProductAfterTax);
				
				/*if(precioPagadoPorProducto > totalPriceOfProductAfterTax ) {
					double cambioDelCliente = precioPagadoPorProducto - totalPriceOfProductAfterTax;
					System.out.println("El cliente tendra el cambio de " + cambioDelCliente + " euros");

				} */
				
				scanner.nextLine();
				
				
				
			};

			
		} 

	} 
	
	public Double calculateTotalPrice(double productPriceToWrite, double productQuantityToWrite ) {
		double totalPriceOfProducts = productPriceToWrite * productQuantityToWrite ;
		System.out.println("Precio total " + totalPriceOfProducts);
		return totalPriceOfProducts;
	}
	
	public Double getValueAfterIVA(int ivaToSelect, double totalPriceOfProducts ) {
		double valueAfterIva = 0;
		if(ivaToSelect == 4) {
			valueAfterIva = (totalPriceOfProducts * 4)/100;
			
			System.out.println("El valor despues de 4% es "+ valueAfterIva );

		}
		else if(ivaToSelect == 21) {
			valueAfterIva = (totalPriceOfProducts * 21)/100;
			System.out.println("El valor despues de 21% "+ valueAfterIva );

		}
		return valueAfterIva;
	}
	
	public Double getTotalPriceOfProductAfterTax(double totalPriceOfProducts, double valueAfterIva ) {
		double totalPriceOfProductAfterTax = totalPriceOfProducts + valueAfterIva;
		System.out.println("El precio total after Tax es " + totalPriceOfProductAfterTax );
		return totalPriceOfProductAfterTax;
	}
	
	public Double getcambioDelCliente(double precioPagadoPorProducto, double totalPriceOfProductAfterTax ) {
		double cambioDelCliente = 0.0;
		if(precioPagadoPorProducto > totalPriceOfProductAfterTax ) {
			 cambioDelCliente = precioPagadoPorProducto - totalPriceOfProductAfterTax;	
			System.out.println("El cliente tendra el cambio de " + cambioDelCliente + " euros");
			

		} 
		else if(precioPagadoPorProducto < totalPriceOfProductAfterTax ) {
			 cambioDelCliente = totalPriceOfProductAfterTax - precioPagadoPorProducto;	
			 System.out.println("El cliente tiene que pagar " + cambioDelCliente + " mas");
			

		} 
		else if(precioPagadoPorProducto == totalPriceOfProductAfterTax ) {
			 
			 System.out.println("Todo perf!");
			

		} 
		
		return cambioDelCliente;
	}
	
	
	 public static void main(String[] args) {
		    Hashtable<String, Hashtable<String, Double>> products = new Hashtable<>();

	        
	        Scanner scanner = new Scanner(System.in);
	    	
	    	Tarea2 tarea2 = new Tarea2();

	    	tarea2.controlProduct(products, scanner);
	    	
	    	scanner.close();
	    }


}

