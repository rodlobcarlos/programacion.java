package torneo_tenis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Partidos {

	private Jugador jugador1;
	private Jugador jugador2;
	private Estado estado;
	private LocalDate fecha;
	private List<Integer> puntuacion_set;
	private List<Jugador> listaPartidos;
	
	public Jugador getJugador1() {
		return jugador1;
	}
	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}
	public Jugador getJugador2() {
		return jugador2;
	}
	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public List<Integer> getPuntuacion_set() {
		return puntuacion_set;
	}
	public void setPuntuacion_set(List<Integer> puntuacion_set) {
		this.puntuacion_set = puntuacion_set;
	}
	public List<Partidos> getListaPartidos() {
		return listaPartidos;
	}
	public void setListaPartidos(List<Partidos> listaPartidos) {
		this.listaPartidos = listaPartidos;
	}
	
	public Partidos(Jugador jugador1, Jugador jugador2, Estado estado, LocalDate fecha, List<Integer> puntuacion_set,
			List<Partidos> listaPartidos) {
		super();
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.estado = estado;
		this.fecha = fecha;
		this.puntuacion_set = puntuacion_set;
		this.listaPartidos = new ArrayList<Jugador>();
	}
	
	@Override
	public String toString() {
		return "Partidos [jugador1=" + jugador1 + ", jugador2=" + jugador2 + ", estado=" + estado + ", fecha=" + fecha
				+ ", puntuacion_set=" + puntuacion_set + ", listaPartidos=" + listaPartidos + "]";
	}
	
	public void registrarPartido(Jugador j1, Jugador j2) {
		if(listaPartidos == null) {
			listaPartidos.add(j1);
			listaPartidos.add(j2);
		}
	}
	
	public List<Jugador> mostrarPartidos(Partidos p) throws TorneoException {
		if(p.jugador1 == null || p.jugador2 == null) {
			throw new TorneoException("Este jugador no está en el torneo.");
		}
		return listaPartidos;
		
	}
	
	// METODO PARA LA MEJOR PUNTUACION // 
	
}
