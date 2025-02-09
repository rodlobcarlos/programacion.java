package orientacionObjetos;

public class Edificio {
	int num_plantas;
	float extension;
	String direccion;
	
	
	public Edificio() {
		super();
		
	}

	public Edificio(int num_plantas, float extension, String direccion) {
		super();
		this.num_plantas = num_plantas;
		this.extension = extension;
		this.direccion = direccion;
	}
}
