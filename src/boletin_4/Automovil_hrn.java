package boletin_4;

public class Automovil_hrn extends Vehiculo_hrn {
	private String calificacionEcologica;

	public Automovil_hrn(String dueño, int numPuertas, int numRuedas, String calificacionEcologica) {
		super(dueño, numPuertas, numRuedas);
		this.calificacionEcologica = calificacionEcologica;
	}

	@Override
	public String toString() {
		return "Automovil_hrn [calificacionEcologica=" + calificacionEcologica + "]";
	}

	public String getCalificacionEcologica() {
		return calificacionEcologica;
	}

	public void setCalificacionEcologica(String calificacionEcologica) {
		this.calificacionEcologica = calificacionEcologica;
	}
}
