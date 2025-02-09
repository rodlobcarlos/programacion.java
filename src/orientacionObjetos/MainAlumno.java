package orientacionObjetos;

public class MainAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno Carlos = new Alumno();
		Carlos.nombre = "Carlos";
		Carlos.dni = "217423489";
		Carlos.nota = 7;
		
		Alumno Pepe = new Alumno();
		Pepe.nombre = "Pepe";
		Pepe.dni = "123657936";
		Pepe.nota = 5;
		
		String cadenaPepe = Pepe.pasoACadena();
		System.out.println(cadenaPepe);
		String cadenaCarlos = Carlos.pasoACadena();
		System.out.println(cadenaCarlos);
		
		Carlos.nota = 8;
		boolean apruebaCarlos = Carlos.aprobada();
		System.out.println(apruebaCarlos);
	}

}
