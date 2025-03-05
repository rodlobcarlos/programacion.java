package modelo;

public class Loro extends Aves {
	private String origen;
	private String habla;
	
	public Loro(String origen, String habla) {
		super();
		this.origen = origen;
		this.habla = habla;
	}

	public void muestra(Aves a) {
		System.out.println("Origen: " + origen);
		System.out.println("Habla: " + habla);		
	}
	
	@Override
	public boolean volar() {
		return true;
	}
	
	public boolean habla() {
		return false;
		
	}
}
