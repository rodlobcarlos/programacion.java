package torneo_tenis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Torneo {
	
	private Set<Jugador> jugadores;
	private List<Partidos> partidos;
	
	public Set<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(Set<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public List<Partidos> getPartidos() {
		return partidos;
	}
	public void setPartidos(List<Partidos> partidos) {
		this.partidos = partidos;
	}
	public Torneo() {
		super();
		this.jugadores = new HashSet<Jugador>();
		this.partidos = new ArrayList<Partidos>();
	}
	@Override
	public String toString() {
		return "Torneo [jugadores=" + jugadores + ", partidos=" + partidos + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(jugadores, partidos);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Torneo other = (Torneo) obj;
		return Objects.equals(jugadores, other.jugadores) && Objects.equals(partidos, other.partidos);
	}
	
	public boolean agregarJugador(Jugador j) throws TorneoException {
		boolean esta = false;
		if(jugadores.contains(j)) {
			esta = false;
			throw new TorneoException("Este jugador está añadido ya.");
			
		}else {
			esta = true;
			jugadores.add(j);
			System.out.println("Se ha añadido el jugador ->" + j);
			
		}
		return esta;
	}
	
	public boolean registrarPartido(Partidos p) {
		boolean registrado = false;
		if(partidos.contains(p)) {
			registrado = false;
			System.out.println("Ya está este partido añadido.");
			
		}else {
			partidos.add(p);
			registrado = true;
			System.out.println("El partido -> " + p);
		}
		return registrado;
		
	}
	
	public Set<Jugador> muestraListaJugadores() {
		return jugadores;
	}
	
	public void mostrarPartidos(Jugador j) throws TorneoException {
		if(!jugadores.contains(j)) {
			throw new TorneoException("Este jugador no está en el torneo.");
		}else {
			System.out.println("Lista de partidos -> " + j.getNombre() + " " + j.getApellido() + " " + j.getNacionalidad() + " " +  j.getNum_partidos());
		}
	}
	
	public void getJugadorGanador() {
		Iterator<Partidos> itr = partidos.iterator();	
		while(itr.hasNext()) {
			
		}
	}
}
