package modelo;

public class Canario extends Aves{
	private String color;
	private String canta;
	
	void muestra() {
		System.out.println("Color: " + color);
		System.out.println("Canta: " + canta);
	}
	
	boolean habla() {
		boolean habla = false;
		return habla;
	}
	
	public boolean volar() {
		 boolean vuela = true;
		return vuela;
	}
}
