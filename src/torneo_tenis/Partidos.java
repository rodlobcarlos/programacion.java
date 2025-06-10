package torneo_tenis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import simulacionTorneoTenis_modelo.Partido;

public class Partidos {

	private Jugador jugador1;
	private Jugador jugador2;
	private Estado estado;
	private LocalDate fecha;
	private List<Integer> puntuacionJugador1;
	private List<Integer> puntuacionJugador2;
	
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
	public List<Integer> getPuntuacionJugador1() {
		return puntuacionJugador1;
	}
	public void setPuntuacionJugador1(List<Integer> puntuacionJugador1) {
		this.puntuacionJugador1 = puntuacionJugador1;
	}
	public List<Integer> getPuntuacionJugador2() {
		return puntuacionJugador2;
	}
	public void setPuntuacionJugador2(List<Integer> puntuacionJugador2) {
		this.puntuacionJugador2 = puntuacionJugador2;
	}
	
	public Partidos(Jugador jugador1, Jugador jugador2, Estado estado, LocalDate fecha) {
		super();
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.estado = estado;
		this.fecha = fecha;
		this.puntuacionJugador1 = new ArrayList<>();
        this.puntuacionJugador2 = new ArrayList<>();
		
	}
	public Partidos() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Partidos [jugador1=" + jugador1 + ", jugador2=" + jugador2 + ", estado=" + estado + ", fecha=" + fecha
				+ ", puntuacionJugador1=" + puntuacionJugador1 + ", puntuacionJugador2=" + puntuacionJugador2 + "]";
	}
	
	
	
}
