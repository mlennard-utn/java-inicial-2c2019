package ar.edu.utn.frba.sceu.arreglos;

import java.util.*;

public class Alumno {
	//Atributos
	private String nombre;
	private String apellido;
	private ArrayList<Integer> notas;
	//private double promedio = 0;
	
	//Metodos
	public Alumno(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void cargarNota(int nota) {
		this.notas.add(nota);
	}

	public double getPromedio() {
		int i, suma= 0;
		
		for(i=0; i < this.notas.size(); i++) {
			suma += this.notas.get(i);
		}
			
		return (suma/this.notas.size());
	}
}
