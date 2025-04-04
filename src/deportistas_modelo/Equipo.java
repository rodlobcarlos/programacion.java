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

	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
		this.alumnos = new LinkedList<Alumno>();
	}

	public void añadirAlumno(Alumno a) throws DeportivosException {
		if(alumnos.contains(a)) {
			throw new DeportivosException("Este alumno ya está en la lista");
		}else {
			alumnos.add(a);
			System.out.println(a + " añadido");
		}
	}
	
	public void borrarAlumno(Alumno a) throws DeportivosException {
		if(alumnos.contains(a)) {
			alumnos.remove(a);
			System.out.println(a+ " borrado");
		}else {
			throw new DeportivosException("Este alumno no existe en la lista");
		}
	}
	
	public LinkedList<Alumno> alumnoPertenece(Alumno a) {
		if(alumnos.contains(a)) {
			System.out.println("Alumno que pertenece al equipo: ");
			return alumnos;
		}else {
			return null;
		}
	}
	
	public void mostrarLista() {
		for(Alumno a : alumnos) {
			System.out.println("Lista del equipo: " + a);
		}
	}
	
	public void mostrarEquipo() {
        System.out.println("Equipo: "+ getNombre() + alumnos.toString());
    }
	
/*	public Equipo union(Equipo eq, LinkedList<Alumno> alumno) {
		for(Alumno alumno : alumnos) {
			return alumno + eq;
		}
	}
*/
	
/*	public Equipo intersecionEquipos(Equipo eq) {
		return eq;
 }
*/
}