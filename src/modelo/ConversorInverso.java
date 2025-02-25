package modelo;

public class ConversorInverso {
	private float dolares;
	public final static float euros = 0.96f;
	
	@Override
	public String toString() {
		return "ConversorInverso [dolares=" + dolares + "]";
	}

	public ConversorInverso(float dolares) {
		super();
		this.dolares = dolares;
	}
	
	public static void dolares_a_euros(ConversorInverso d) {
		if(d.dolares > 0) {
			double conversion = d.dolares * euros;
			System.out.println(conversion);
		}else {
			System.out.println("Cantidad no valida");
		}
	}
}
