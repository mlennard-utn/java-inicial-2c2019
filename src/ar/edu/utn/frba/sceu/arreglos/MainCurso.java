package ar.edu.utn.frba.sceu.arreglos;

import java.util.Scanner;

public class MainCurso {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		String[] nombres = new String[4];
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Ingrese un nombre");
			nombres[i] = in.nextLine();
		}
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Nombre: " + nombres[i]);
		}
		
		
	}

}
