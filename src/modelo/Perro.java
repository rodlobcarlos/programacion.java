package modelo;

public class Perro extends Mascota{
	private String raza;
	private String pulgas;
	
	public Perro(String raza, String pulgas) {
		super();
		this.raza = raza;
		this.pulgas = pulgas;
	}

	@Override
	public boolean habla() {
		return false;
	}

	@Override
	public void muestra(Mascota m) {
		System.out.println("Raza: " + raza);
		System.out.println("Pulgas: " + pulgas);		
	}
}
