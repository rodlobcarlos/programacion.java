package modelo;

public class ConversorInverso {
	private float dolares;
	public final static float EUROS = 1.05f;
	
	@Override
	public String toString() {
		return "ConversorInverso [dolares=" + dolares + "]";
	}

	public ConversorInverso(float dolares) {
		super();
		this.dolares = dolares;
	}
	
	public static float calcula_dolares_a_euros(ConversorInverso d) {
		float conversion;
		if(d.dolares > 0) {
			conversion = d.dolares * EUROS;
		}else {
			conversion = 0;
			System.out.println("Cantidad no valida");
		}
		return conversion;
	}
}
