package boletin_3;

import java.util.Arrays;

public class Torneo {
	private String nombre;
	private Participante[] participantes;
	private Participante ganador;

	
	@Override
	public String toString() {
		return "Torneo [nombre=" + nombre + ", participantes=" + Arrays.toString(participantes) + ", ganador=" + ganador
				+ "]";
	}

	public Torneo(String nombre, Participante[] participantes) {
		super();
		this.nombre = nombre;
		this.participantes = participantes;

	}

	Participante mayorPuntuacion() {
		int puntos = 0;
		Participante ganador = null;
		for(Participante p: this.participantes) {
			if(p.getPuntuacion() > puntos) {
				ganador = p;
				puntos = p.getPuntuacion();
			}
		}
		return ganador;
	}
	
	Participante juGanador() {
		this.ganador = this.mayorPuntuacion();
		return ganador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Participante[] getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Participante[] participantes) {
		this.participantes = participantes;
	}

	public Participante getGanador() {
		return ganador;
	}

	public void setGanador(Participante ganador) {
		this.ganador = ganador;
	}
	
}