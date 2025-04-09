package simulacionReservasEntradasEventos_modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Eventos {
	private String nombre;
	private LocalDate fecha_evento;
	private String lugar;
	private ArrayList<Reserva> reservas;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha_evento() {
		return fecha_evento;
	}
	public void setFecha_evento(LocalDate fecha_evento) {
		this.fecha_evento = fecha_evento;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public ArrayList<Reserva> getReservas() {
		return reservas;
	}
	public void setReservas(ArrayList<Reserva> reservas) {
		this.reservas = reservas;
	}
	@Override
	public String toString() {
		return "Eventos [nombre=" + nombre + ", fecha_evento=" + fecha_evento + ", lugar=" + lugar + ", reservas="
				+ reservas + "]";
	}
	public Eventos(String nombre, LocalDate fecha_evento, String lugar, ArrayList<Reserva> reservas) {
		super();
		this.nombre = nombre;
		this.fecha_evento = fecha_evento;
		this.lugar = lugar;
		this.reservas = reservas;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(fecha_evento, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Eventos other = (Eventos) obj;
		return Objects.equals(fecha_evento, other.fecha_evento) && Objects.equals(nombre, other.nombre);
	}
}
