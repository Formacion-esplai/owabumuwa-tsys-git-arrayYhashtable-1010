package tarea3;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Scanner;

public class Tarea3 {
	
	
	double newPrice = 0.0;

	public double agregarProducto(Hashtable<String, Double> products, Scanner scanner) {
		
	
    /*	products.put("apple", 30.0);
    	products.put("milk", 2.0);
    	products.put("grapes", 5.0);
    	products.put("paper bag", 1.0);
    	products.put("saop", 3.0); */

		while (true) {		
            System.out.println("Que accion te gustaria hacer? Eligie el numero");
            System.out.println("1. Agregar un nuevo producto");
            System.out.println("2. Actualizar el precio de un producto");
            System.out.println("3. Mostrar productos y precios");
            System.out.println("4. Parar el proceso");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {System.out.println("3. Mostrar productos y precios");
            	System.out.println("Escribir el nombre del producto");
            	String newProduct = scanner.nextLine();
            	
            	System.out.println("Escribir el precio del producto");
            	newPrice = scanner.nextDouble();
            	products.put(newProduct, newPrice);
            	System.out.println(products);
            }
            
            else if (choice == 2) {
            	System.out.print("Ingrese el nombre del producto para actualizar su precio: ");
                String nameOfProduct = scanner.nextLine();
                if (products.containsKey(nameOfProduct)) {
                    System.out.print("Ingrese el nuevo precio para " + nameOfProduct);
                    newPrice = scanner.nextDouble();
                    products.put(nameOfProduct, newPrice);
                    System.out.println("Precio de " + nameOfProduct + " actualizado a " + newPrice);
                	System.out.println("Ahora tu lista es asi " + products);
                } else {
                    System.out.println("No exsite este nmombre");
                	System.out.println("Tu lista es asi " + products);
                }
            	
            }
			 
            else if (choice == 3) {
				 Set<Map.Entry<String, Double>> values = products.entrySet();
	            	for(Map.Entry<String, Double> e : values) {
	                	
	            		System.out.println(e.getKey() + " " + e.getValue() + " ");
	            	}		 	
		    }
            
		   else if (choice == 4) {
			   System.out.println("Ya esta parada");
	            break; 
	            
	        }
        	
    	}
		return newPrice;
	}
	
	
	
    public static void main(String[] args) {
    	Hashtable<String, Double> products  = new Hashtable<>();
    	Scanner scanner = new Scanner(System.in);
    	
    	Tarea3 ProductosShop = new Tarea3();

    	ProductosShop.agregarProducto(products, scanner);
    	
    }

}
