package modelo;

public class Canario extends Aves{
	private String color;
	private String canta;
	
	public Canario(String color, String canta) {
		super();
		this.color = color;
		this.canta = canta;
	}
	
	@Override
	public void muestra(Aves a) {
		System.out.println("Color: " + color);
		System.out.println("Canta: " + canta);		
	}
	
	boolean habla() {
		return false;
	}

	@Override
	public boolean volar() {
		return false;
	}
}
