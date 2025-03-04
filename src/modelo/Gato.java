package modelo;

public class Gato extends Mascota{
	private String color;
	private String peloLargo;
	
	public Gato(String color, String peloLargo) {
		super();
		this.color = color;
		this.peloLargo = peloLargo;
	}

	@Override
	public boolean habla() {
		return false;
	}

	@Override
	public void muestra(Mascota m) {
		System.out.println("Color: " + color);
		System.out.println("Pelo: " + peloLargo);		
	}
}
