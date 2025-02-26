package modelo;

public class Conversor {
	private float euros;
	public final static float DOLARES = 0.96f;

	@Override
	public String toString() {
		return "Conversor [euros=" + euros + ", dolares=" + DOLARES + "]";
	}

	public Conversor(float euros) {
		super();
		this.euros = euros;
	}

	public static float calcula_euros_a_dolares(Conversor e) {
		float conversion;
		if (e.euros > 0) {
			conversion = e.euros * DOLARES;
		} else {
			conversion = 0;
			System.out.println("Cantidad no valida");
		}
		return conversion;
	}
}
