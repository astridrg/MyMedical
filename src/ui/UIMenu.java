package ui;
import java.util.Scanner;

public class UIMenu {
	
	public static String[] MONTHS= {"enero", "febrero", "marzo", "abril","mayo", "junio", "julio", "agosto","septiembre", "octubre", "noviembre", "diciembre"};
	
	public static void showMenu() {
		System.out.println("Bienvenido a mi cita");
		System.out.println("Selecciona la opcion deseada");
		int response=0;
		
		do {
			
			System.out.println("1.Doctor");
			System.out.println("2.Paciente");
			System.out.println("3.Salir");
			
			Scanner sc= new Scanner(System.in);
			response = Integer.valueOf(sc.nextLine());
			
			switch (response) {
			case 1:
				System.out.println("Doctor");
				break;
			case 2:
                response = 0;
                showPatientMenu();
                break;
			case 0:
				System.out.println("Gracias por su visita");
				break;

			default:
				System.out.println("Selecciona un numero correcto");
			}
			
		} while (response != 0);
		
	}
	
	    public static void showPatientMenu(){
	        int response = 0;
	        do {
	            System.out.println("\n\n");
	            System.out.println("Paciente");
	            System.out.println("1. Libro de citas");
	            System.out.println("2. Mis citas");
	            System.out.println("0. Regreso");

	            Scanner sc = new Scanner(System.in);
	            response = Integer.valueOf(sc.nextLine());

	            switch (response){
	                case 1:
	                    System.out.println("::Libro de citas");
	                    for (int i = 1; i < MONTHS.length -8; i++) {
	                    	System.out.println(i + ". " + MONTHS[i-1]);
							
						}
	                    break;
	                case 2:
	                    System.out.println("::Mis citas");
	                    break;
	                case 0:
	                    showMenu();
	                    break;
	            }
	        }while (response != 0);
	    }


}
