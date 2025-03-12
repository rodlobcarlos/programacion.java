package modelo;

public class PersonaRefactoriza {
	String nombre;

	public void identificarse() {
		System.out.println("Soy una persona y me llamo " + nombre);
	}
}

class Empleado extends PersonaRefactoriza {
	public void trabajar() {
		System.out.println(nombre + " está trabajando.");
	}
}

class Cliente extends PersonaRefactoriza {
	public void comprar() {
		System.out.println(nombre + " está comprando.");
	}
}

// Agregamos más clases para hacer evidente el problema

class Estudiante extends PersonaRefactoriza {
	public void estudiar() {
		System.out.println(nombre + " está estudiando.");
	}
}

// Un problema surge aquí: ¿qué pasa si un Estudiante también es Empleado?
class EstudianteEmpleado extends Estudiante {
	public void trabajar() {
		System.out.println(nombre + " está estudiando y trabajando.");
	}
}

// Agregamos otra clase con otro comportamiento
class Artista extends PersonaRefactoriza {
	public void pintar() {
		System.out.println(nombre + " está pintando.");
	}
}
