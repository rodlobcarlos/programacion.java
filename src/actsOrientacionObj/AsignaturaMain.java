package actsOrientacionObj;

public class AsignaturaMain {

	public static void main(String[] args) {
		Alumno lucia = new Alumno("Lucia", "García");
		lucia.notaProgramacion = new NotaAsignatura("Programación ", 5, 7, 7);
		lucia.notaBaseDeDatos = new NotaAsignatura("Base de datos ", 6, 6, 7);
		
		Alumno andres = new Alumno("Andrés", "Hernandez");
		andres.notaProgramacion = new NotaAsignatura("Programación ", 4, 4, 6);
		andres.notaBaseDeDatos = new NotaAsignatura("Base de datos", 9, 8, 8);
		
		Alumno vicente = new Alumno("Vicente", "Perez");
		vicente.notaProgramacion = new NotaAsignatura("Programación ", 2, 2, 3);
		vicente.notaBaseDeDatos = new NotaAsignatura("Base de datos", 6, 6, 7);
		
		vicente.notaProgramacion.notaMedia();
		vicente.notaBaseDeDatos.notaMedia();
		
		vicente.imprimeSiHaAprobado();
		
		lucia.imprimeSiHaAprobado();
	}
}