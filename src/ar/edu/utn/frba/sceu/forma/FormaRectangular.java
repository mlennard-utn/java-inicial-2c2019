package ar.edu.utn.frba.sceu.forma;

public class FormaRectangular {
	
	private int altura;
	private int base;
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura1) {
		altura = altura1;
	}
	
	public int area() {
		return this.base * this.altura;
	}

	public int perimetro() {
		int perimetro;
		perimetro = (this.base + this.altura) * 2;
		return perimetro;
	}
	
	public boolean esCuadrado() { 
		return base == altura;
	}
	
}
