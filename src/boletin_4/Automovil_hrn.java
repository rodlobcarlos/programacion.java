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

	boolean tieneLimitacionParaCircular(String ciudad) {
		boolean cierto = false;
		if (ciudad == "Madrid" || ciudad == "Barcelona" && calificacionEcologica == "B" || calificacionEcologica == "C") {
			cierto = true;
		}else if (ciudad == "Valencia" || ciudad == "Barcelona" && calificacionEcologica == "C") {
			cierto = true;
		}else {
			cierto = false;
		}
		return cierto;
	}
}
