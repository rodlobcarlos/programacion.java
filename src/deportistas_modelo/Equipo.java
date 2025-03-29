package deportistas_modelo;

import java.util.LinkedList;

public class Equipo {
	private String nombre;
	private LinkedList<Alumno> alumnos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LinkedList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(LinkedList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", alumnos=" + alumnos + "]";
	}

	public Equipo(String nombre, LinkedList<Alumno> alumnos) {
		super();
		this.nombre = nombre;
		this.alumnos = alumnos;
	}

	void añadirAlumno(Alumno a) throws DeportivosException {
		if(alumnos.contains(a)) {
			throw new DeportivosException("Este alumno ya está en la lista");
		}else {
			alumnos.add(a);
		}
	}
	
	void borrarAlumno(Alumno a) throws DeportivosException {
		if(alumnos.contains(a)) {
			alumnos.remove(a);
		}else {
			throw new DeportivosException("Este alumno no existe en la lista");
		}
	}
	
	LinkedList<Alumno> alumnoPertenece(Alumno a) {
		if(alumnos.contains(a)) {
			return alumnos;
		}else {
			return null;
		}
	}
	
	void mostrarLista() {
		for(Alumno a : alumnos) {
			System.out.println(a);
		}
	}
}