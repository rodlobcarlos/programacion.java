package modelo;

public class PersonaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona Carlos = new Persona("Carlos. R", 0);
		IAccion acciones = Carlos.getAcciones();
		acciones[0] = new Estudiante();
		System.out.println(Carlos);
	}
	
}
