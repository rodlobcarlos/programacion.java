package simulacionReservasEntradasEventos_modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Reserva {
	private int id_reserva;
	private LocalDate fecha_reserva;
	private EstadoReserva estado;
	private Usuario User_reserva;
	
	public int getId_reserva() {
		return id_reserva;
	}
	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}
	public LocalDate getFecha_reserva() {
		return fecha_reserva;
	}
	public void setFecha_reserva(LocalDate fecha_reserva) {
		this.fecha_reserva = fecha_reserva;
	}
	public EstadoReserva getEstado() {
		return estado;
	}
	public void setEstado(EstadoReserva estado) {
		this.estado = estado;
	}
	public Usuario getUser_reserva() {
		return User_reserva;
	}
	public void setUser_reserva(Usuario user_reserva) {
		User_reserva = user_reserva;
	}
	@Override
	public String toString() {
		return "Reserva [id_reserva=" + id_reserva + ", fecha_reserva=" + fecha_reserva + ", estado=" + estado
				+ ", User_reserva=" + User_reserva + "]";
	}
	public Reserva(int id_reserva, LocalDate fecha_reserva, EstadoReserva estado, Usuario user_reserva) {
		super();
		this.id_reserva = id_reserva;
		this.fecha_reserva = fecha_reserva;
		this.estado = estado;
		User_reserva = user_reserva;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id_reserva);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		return id_reserva == other.id_reserva;
	}
}
