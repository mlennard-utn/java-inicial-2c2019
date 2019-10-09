package ar.edu.utn.frba.sceu.arreglos;

import java.util.Scanner;

public class MainCurso {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		String nombre, apellido;
		int i;
		
		float nota1 = 0;
		float nota2 = 0;
		//String[] nombres = new String[4];

		Alumno alumnoMejorPromedio;
	
		Alumno[] misAlumnos = new Alumno[3];
		
		for (i = 0; i < misAlumnos.length; i++) {
			System.out.println("Ingrese un nombre");
			nombre = in.nextLine();
			
			System.out.println("Ingrese un apellido");
			apellido = in.nextLine();
			
			misAlumnos[i] = new Alumno(nombre, apellido);

			while(nota1 < 1 || nota1 > 10) {
				System.out.println("Ingresa tu primer nota");
				nota1 = in.nextFloat();
			}

			while(nota1 < 1 || nota1 > 10) {
				System.out.println("Ingresa tu segunda nota");
				nota2 = in.nextFloat();
			}
			
			misAlumnos[i].setNota1(nota1);
			misAlumnos[i].setNota2(nota2);
			
			in.nextLine();
			
			
		}
		
		alumnoMejorPromedio = misAlumnos[0];
		
		for(i = 0; i < misAlumnos.length; i++) {
			System.out.println(misAlumnos[i].getNombre()+" "+misAlumnos[i].getApellido()+" tiene un promedio de "+misAlumnos[i].promedio());
		
			if(alumnoMejorPromedio.promedio() < misAlumnos[i].promedio()) {
				alumnoMejorPromedio = misAlumnos[i];
			}
		
		}

		System.out.println("El alumno con mejor promedio es "+alumnoMejorPromedio.getNombre()+" "+alumnoMejorPromedio.getApellido()+" y su promedio es "+alumnoMejorPromedio.promedio());
		
/*		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Nombre: " + nombres[i]);
		}
*/		
		
	}

}
