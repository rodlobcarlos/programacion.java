package colecciones;

import java.util.ArrayList;
import java.util.List;

public class GestionaEquipo {

	public static void main(String[] args) {
		
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();

		Alumno alum1 = new Alumno("Carlos", "12345678s");
		Alumno alum2 = new Alumno("María", "123456453c");
		Alumno alum3 = new Alumno("juan", "1235435378s");
		Alumno alum4 = new Alumno("Carmen", "134216265f"); 	
		
		listaAlumnos.add(alum4);
		listaAlumnos.add(alum3);
		listaAlumnos.add(alum2);
		listaAlumnos.add(alum1);
		
		Equipo eq1 = new Equipo("Equipo1");
		Equipo eq2 = new Equipo("Equipo2");

		try {
			eq1.añadirAlumno(alum1);
			eq1.añadirAlumno(alum2);
			eq2.añadirAlumno(alum3);
			eq2.añadirAlumno(alum4);
			eq2.añadirAlumno(alum1);
			
		}catch (DeportivosException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			eq1.borrarAlumno(alum2);
			eq1.añadirAlumno(alum1);
		}catch (DeportivosException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(eq1.pertenece(alum1));
		eq1.listaAlumno();
		
		System.out.println(eq1.union(eq2));
		
		System.out.println(eq1.interseccionEquipo(eq2));
	}
	
	

}
