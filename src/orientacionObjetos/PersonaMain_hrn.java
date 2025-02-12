package orientacionObjetos;

public class PersonaMain_hrn {

	public static void main(String[] args) {
		Persona_hrn persona1 = new Persona_hrn("Carlos", "Rodríguez", 20, 1500, "rodlobcarlos@gmail.com");
		Entrenador_hrn persona2 = new Entrenador_hrn("Carlos", 20);
		
		
		System.out.println(persona1.toString());
		persona1.concentrarse();
		persona1.concentrarse("Sevilla");
		persona1.concentrarse(30);
		Entrenador_hrn persona2ToEntrenador = (Entrenador_hrn)persona2;
		
	}

}
