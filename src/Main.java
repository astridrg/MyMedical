import java.util.Scanner;

import Model.Doctor;
import Model.Paciente;

import static ui.UIMenu.*;

public class Main {
	
	public static void main(String args[]){  
		//showMenu();
		Paciente paciente= new Paciente("juan","juanmb@gmail.com");
		System.out.println(paciente);
		
		System.out.println();
		
		Doctor myDoctor=new Doctor("astird", "astrid@gmail.com");
		myDoctor.setCitasDisponibes( "27-11-1992", "14pm");
		System.out.println("nombre " + myDoctor.getName());
		System.out.println("email " + myDoctor.getEmail());
		System.out.println(myDoctor);
		


	}  
	
}
