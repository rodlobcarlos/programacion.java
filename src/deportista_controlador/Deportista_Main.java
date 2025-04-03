package deportista_controlador;

import java.util.LinkedList;

import deportistas_modelo.Alumno;
import deportistas_modelo.DeportivosException;
import deportistas_modelo.Equipo;

public class Deportista_Main {

	public static void main(String[] args) throws DeportivosException {
		LinkedList<Alumno> alumnos = new LinkedList<Alumno>();
		Alumno alu1 = new Alumno("Carlos", "12345678s");
		
		Equipo eq1 = new Equipo("Equipo1");
		eq1.añadirAlumno(alu1);
		
		System.out.println("Hola criaturitas, sois muy grandes");
		
		eq1.mostrarEquipo();
		
/*		try {
			eq1.
		} catch (DeportivosException e) {
			e.printStackTrace();
			throw e;
		}
*/	}
}
