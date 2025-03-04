package modelo;

public abstract class Aves {
	private String pico;
	private String vuela;
	
	void muestra() {
		System.out.println("Pico: " + pico);
		System.out.println("Vuela: " + vuela);
	}
	
	public abstract boolean volar();
}
