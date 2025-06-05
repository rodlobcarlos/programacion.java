package colecciones;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

	private String nombre;
	private List<Alumno> listaAlumno;

	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
		this.listaAlumno = new ArrayList<Alumno>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Alumno> getListaAlumno() {
		return listaAlumno;
	}

	public void setListaAlumno(List<Alumno> listaAlumno) {
		this.listaAlumno = listaAlumno;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", listaAlumno=" + listaAlumno + "]";
	}

	public void añadirAlumno(Alumno a) throws DeportivosException {
		if (listaAlumno.contains(a)) {
			throw new DeportivosException("Este alumno ya esta en el equipo.");
		} else {
			listaAlumno.add(a);
			System.out.println(a + "añadido");
		}
	}

	public void borrarAlumno(Alumno a) throws DeportivosException {
		if (listaAlumno.contains(a)) {
			listaAlumno.remove(a);
			System.out.println(a + "borrado");
		} else {
			throw new DeportivosException("Este alumno no está en el equipo.");
		}
	}

	Alumno alumno = null;

	public boolean pertenece(Alumno a) {
		boolean encontrado = false;
		for (Alumno alum : listaAlumno) {
			if (listaAlumno.contains(a)) {
				encontrado = true;
				System.out.println("Alumno que pertenece: " + a);
			} else {
				System.out.println(alumno);
			}
		}
		return encontrado;
	}

	public void listaAlumno() {
		for (Alumno alum : listaAlumno) {
			System.out.println(alum);
		}
	}

	public Equipo union(Equipo otro) {
		Equipo equipoUnido = new Equipo(nombre + otro.nombre);

		System.out.println("Equipo unido:");

		equipoUnido.listaAlumno.addAll(listaAlumno);
		equipoUnido.listaAlumno.addAll(otro.listaAlumno);
		return equipoUnido;
	}

	public Equipo interseccionEquipo(Equipo otro) {
		Equipo equipoInterseccion = new Equipo(nombre + otro.nombre);

		for (Alumno alum : listaAlumno) {
			if (otro.listaAlumno.contains(alum)) {
				equipoInterseccion.listaAlumno.add(alum);
			}
		}
		return equipoInterseccion;

	}
}
