package modelo;

public class Perro extends Mascota{
	private String raza;
	private String pulgas;
	
	void muestra() {
		System.out.println("Raza: " + raza);
		System.out.println("Pulgas: " + pulgas);
	}
	
	public boolean habla() {
		boolean hablar = false;
		return hablar;
	}

	@Override
	public void muestra(Mascota m) {
		// TODO Auto-generated method stub
		
	}

	
}
