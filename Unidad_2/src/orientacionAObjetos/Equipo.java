package orientacionAObjetos;

public class Equipo {
	String nombreEquipo;
	int puntuaciones;
	Persona [] personas;
	
	public Equipo(String nombreEquipo, int puntuaciones, Persona[] personas) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.puntuaciones = puntuaciones;
		this.personas = personas;
	}
	
	float mediaEdad() {
		float mediaEdad = 0f;
		Persona [] tablaPersona = this.personas;
		for(Persona p: tablaPersona) {
			System.out.println(p.edad);
			mediaEdad = mediaEdad + p.edad;
		}
		
		mediaEdad = mediaEdad / Personas;
		
		return mediaEdad;
	}
	
}
