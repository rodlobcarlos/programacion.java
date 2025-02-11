package boletin_4;

public class Profesor extends Persona{
	private String nombreDepartamento;
	private double sueldo;

	double getSueldo() {
		return sueldo;
	}

	void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	protected String getNombreDepartamento() {
		return nombreDepartamento;
	}

	protected void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	public Profesor(String nombre, String nombreDepartamento) {
		super(nombre);
		this.nombreDepartamento = nombreDepartamento;
	}

	@Override
	public String toString() {
		return "Profesor [nombreDepartamento=" + nombreDepartamento + ", getNombre()=" + getNombre() + "]";
	}
}