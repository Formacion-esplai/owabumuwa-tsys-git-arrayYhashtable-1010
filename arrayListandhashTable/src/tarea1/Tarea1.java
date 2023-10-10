package tarea1;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tarea1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	//	ArrayList<Double> arrayList = new ArrayList<>();
		
        Map<String, List<Double>> hashMap = new HashMap<>();
		
		ArrayList<String> students = new ArrayList<>();
		String student_first_name = "";
		
		
		while(true) {
	            ArrayList<Double> points = new ArrayList<>();

				System.out.println("Entrat nombres de estudiantes y entrar stop para parar");
				student_first_name = scanner.nextLine();
				
				
				if(student_first_name.equals("stop")) {
					break;
					
				};
				
				
				
				System.out.println("Entrat los 5 puntos para " + student_first_name);
	            for (int i = 0; i < 5; i++) {
	                Double point = scanner.nextDouble();
	                points.add(point);
	                System.out.println(points);
	            }
	            
	            scanner.nextLine();

				hashMap.put(student_first_name, points);
					
			}
		
			
			
		for (Map.Entry<String, List<Double>> entry : hashMap.entrySet()) {
            String studentName = entry.getKey();
            List<Double> studentPoints = entry.getValue();

            System.out.println("El nombre del estudiante: " + studentName);
            System.out.println("Sus puntos: " + studentPoints);
            
        	Double totalPointsForEach = 0.0;

            for (Double studentPoint : studentPoints) {
            	 totalPointsForEach += studentPoint;          	 
            }
            
            
       	    System.out.println("El punto total para " + studentName + " es " + totalPointsForEach);

            double averagePointOfEach = totalPointsForEach/studentPoints.size();

		    System.out.println("Su nota media es: " + averagePointOfEach );
        }
			
		}
		

}
