package boletin_4;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor{
	private LocalDate fechaAdjudicacionPlaza;

	protected LocalDate getFechaAdjudicacionPlaza() {
		return fechaAdjudicacionPlaza;
	}

	protected void setFechaAdjudicacionPlaza(LocalDate fechaAdjudicacionPlaza) {
		this.fechaAdjudicacionPlaza = fechaAdjudicacionPlaza;
	}

	public ProfesorTitular(String nombre, String nombreDepartamento, LocalDate fechaAdjudicacionPlaza) {
		super(nombre, nombreDepartamento);
		this.fechaAdjudicacionPlaza = fechaAdjudicacionPlaza;
	}

	@Override
	public String toString() {
		return "ProfesorTitular [fechaAdjudicacionPlaza=" + fechaAdjudicacionPlaza + ", getNombreDepartamento()="
				+ getNombreDepartamento() + ", getNombre()=" + getNombre() + "]";
	}
	
}
