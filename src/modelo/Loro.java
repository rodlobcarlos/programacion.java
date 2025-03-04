package modelo;

public class Loro extends Aves {
	private String origen;
	private String habla;
	
	void muestra() {
		System.out.println("Origen: " + origen);
		System.out.println("Habla: " + habla);
	}
	
	public boolean volar() {
		boolean vuela = true;
		return vuela;	
	}
	
	public boolean habla() {
		boolean hablar = false;
		return hablar;
		
	}
}
