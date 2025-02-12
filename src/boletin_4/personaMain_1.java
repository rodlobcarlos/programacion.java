package boletin_4;

public class personaMain_1 {

	public static void main(String[] args) {
//		Persona persona1 = new Persona("Carlos", "rodlobcarlos@gmail.com");
//		System.out.println(persona1.toString());
//		Persona persona2 = new Persona("Pepe", "pepe@gmail.com");
//		System.out.println(persona1.equals(persona2)); // false
		
		Persona persona1 = new Persona("Carlos", "rodlobcarlos@gmail.com");
		Persona persona2 = new Persona("Carlos", "rodlobcarlos@gmail.com");
		System.out.println(persona1.toString());
		System.out.println(persona1.equals(persona2)); // true
		
		System.out.println(persona1.getClass().getName()); // imprime donde esta guardada la clase persona
	}

}
