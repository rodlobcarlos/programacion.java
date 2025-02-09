package orientacionObjetos;

public class PersonasMain {

	public static void main(String[] args) {
		Persona p1 = new Persona("Andrea", "Perea", "12345678c");
		Persona p2 = new Persona("Luis", "Perea", "124456782t");
		Persona p3 = new Persona("David", "Perez", "145673469p");
		Persona p4 = new Persona("Sebastian", "Rodríguez", "12456783d");

		Persona [] persona1 = {p1, p2};
		Persona [] persona2 = {p3, p4};
		int [] puntuaciones1 = {7, 14, 22};
		int [] puntuaciones2 = {40, 12, 3};
		
		Equipo equipo1 = new Equipo("equipo1", puntuaciones1, persona1);
		System.out.println(equipo1);
		Persona [] tablaPersonas = equipo1.personas;
		for(int i = 0; i < tablaPersonas.length; i++) {
			Persona p = tablaPersonas[i];
			System.out.println(p.dni);
		}
		Equipo equipo2 = new Equipo("equipo", puntuaciones2, persona2);
		
	}

}
