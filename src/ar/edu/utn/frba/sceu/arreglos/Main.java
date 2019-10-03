package ar.edu.utn.frba.sceu.arreglos;

public class Main {

	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		
		System.out.println("Length: " + numeros.length);
		for (int i = 0; i < numeros.length; i++) {
			//Asignacion de un valor 
			//la posicion sub-i del arreglo
			//numeros[i] = valor que quiero asignarle;
			numeros[i] = i * 2; 
			System.out.println(numeros[i]);
		}
		
		
		
	}

}
