package deportista_controlador;

import java.util.LinkedList;

import deportistas_modelo.Alumno;
import deportistas_modelo.DeportivosException;
import deportistas_modelo.Equipo;

public class Deportista_Main {

	public static void main(String[] args) throws DeportivosException {
		LinkedList<Alumno> alumno = new LinkedList<Alumno>();
		
		Alumno alu1 = new Alumno("Carlos", "12345678s");
		Alumno alu2 = new Alumno("María", "123456453c");
		Alumno alu3 = new Alumno("juan", "1235435378s");
		Alumno alu4 = new Alumno("Carmen", "134216265f");
		
		alumno.add(alu1);
		alumno.add(alu2);
		alumno.add(alu1);
		alumno.add(alu3);
		alumno.add(alu4);
		
		Equipo eq1 = new Equipo("Equipo1");
		Equipo eq2 = new Equipo("Equipo2");


		try {
			eq1.añadirAlumno(alu1);
			eq1.añadirAlumno(alu2);
			eq2.añadirAlumno(alu3);
			eq2.añadirAlumno(alu4);
		} catch (DeportivosException e) {
			System.out.println(e.getMessage());
//			throw e;
		}
		try {
			eq1.borrarAlumno(alu2);
			eq1.añadirAlumno(alu1);
		}catch (DeportivosException e2) {
			System.out.println(e2.getMessage());
//			throw e2;
		}
		
		System.out.println(eq1.alumnoPertenece(alu1));
		eq1.mostrarLista();
		eq1.mostrarEquipo();
		
		System.out.println(eq1.union(eq2));
	}
}
