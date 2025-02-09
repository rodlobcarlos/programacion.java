package orientacionObjetos;

import orientacionAObjetos.NotaAsignatura;

public class Alumno_1 {
	String nombre;
	String apellidos;
	String email;
	NotaAsignatura notaProg;
	NotaAsignatura notaBD;
	
	
	public Alumno_1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alumno_1(String nombre, String email) {
		super();
		this.nombre = nombre;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Alumno_1 [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", notaProg=" + notaProg
				+ ", notaBD=" + notaBD + "]";
	}
}