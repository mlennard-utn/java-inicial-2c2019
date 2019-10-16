package ar.edu.utn.frba.sceu.arreglos;

import java.util.*;

public class Escuela {
	// Atributos
	ArrayList<Alumno> miEscuela;
	
	public void ingresarAlumnos() {
		Scanner in = new Scanner(System.in); 
		String nombre, apellido, continuar = "s";

		while(continuar.contains("s")) {
		
			System.out.println("Ingrese un nombre");
			nombre = in.nextLine();
			
			System.out.println("Ingrese un apellido");
			apellido = in.nextLine();

			this.miEscuela.add(new Alumno(nombre, apellido));
			
			System.out.println("Continuamos? ");
			continuar = in.nextLine();
		}
	}
	
	
	public void ingresarNotasAlumnos() {
		int i;
		String continuar = "s";
		Alumno miAlumno;
		for(i=0; i < this.miEscuela.size(); i++) {
			
			
			while(continuar.contains("s")) {
				
			}

		}
		
	}
}
