package simulacionTorneoTenis_modelo;

import java.util.Set;

public class Jugador {
	private String nombre;
	private String apellido;
	private String nacionalidad;
	private Set<Jugador> jugadores;
	private Set<Partido> partidos;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public Set<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(Set<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public Set<Partido> getPartidos() {
		return partidos;
	}
	public void setPartidos(Set<Partido> partidos) {
		this.partidos = partidos;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad
				+ ", jugadores=" + jugadores + ", partidos=" + partidos + "]";
	}
	public Jugador(String nombre, String apellido, String nacionalidad, Set<Jugador> jugadores, Set<Partido> partidos) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
		this.jugadores = new ;
		this.partidos = partidos;
	}
}
