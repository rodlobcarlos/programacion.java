package actsOrientacionObj;

public class Alumno {
	public String nombre;
	public String apellidos;
	public String email;
	public NotaAsignatura notaProgramacion;
	public NotaAsignatura notaBaseDeDatos;
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", notaProgamacion="
				+ notaProgramacion + ", notaBaseDeDatos=" + notaBaseDeDatos + "]";
	}
	
	public Alumno(String nombre, String email) {
		super();
		this.nombre = nombre;
		this.email = email;
	}
	
	void imprimeSiHaAprobado() {
		if (notaProgramacion.notaMedia() >= 5) {
			System.out.println("El alumno " + nombre + " ha aprobado la asignatura " + notaProgramacion.nombreAsignatura);
		}else {
			System.out.println("El alumno " + nombre + " no ha aprobado la asignatura " + notaProgramacion.nombreAsignatura);
		}
		if (notaBaseDeDatos.notaMedia() >= 5) {
			System.out.println("El alumno " + nombre + " ha aprobado la asignatura " + notaBaseDeDatos.nombreAsignatura);
		}else {
			System.out.println("El alumno " + nombre + " no ha aprobado la asignatura " + notaBaseDeDatos.nombreAsignatura);
		}
	}
}
