package modelo;

public class Conversor {
	private float euros;
	public final static float dolares = 1.05f;

	@Override
	public String toString() {
		return "Conversor [euros=" + euros + ", dolares=" + dolares + "]";
	}

	public Conversor(float euros) {
		super();
		this.euros = euros;
	}

	public static void euros_a_dolares(Conversor e) {
		if (e.euros > 0) {
			double conversion = e.euros * dolares;
			System.out.println(conversion);
		} else {
			System.out.println("Cantidad no valida");
		}
	}
}