package orientacionAObjetos;

public class Alumno {
	String nombre;
	String dni;
	float nota;
	
	boolean pasoACadena() {
		boolean aprueba = true;
		if(nota >= 5) {
			aprueba = true;
		}else {
			aprueba = false;
		}
		return aprueba;
	}
	
}
