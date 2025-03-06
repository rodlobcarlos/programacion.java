package modelo;

import java.time.LocalDate;
import java.util.Objects;

public abstract class DispositivosWifi {
	 private int id;
	 private String mac;
	 private EstadoWifi estadoW;
	 private LocalDate fechaActualizacion;
	private static int contador;

	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		DispositivosWifi.contador = contador;
	}
	
	public DispositivosWifi(int id, String mac, EstadoWifi estadoW, LocalDate fechaActualizacion) {
		super();
		this.id = contador+1;
		this.mac = mac;
		this.estadoW = estadoW;
		this.fechaActualizacion = fechaActualizacion;
		contador = contador+1;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public EstadoWifi getEstadoW() {
		return estadoW;
	}
	public void setEstadoW(EstadoWifi estadoW) {
		this.estadoW = estadoW;
	}
	public LocalDate getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(LocalDate fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(mac);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DispositivosWifi other = (DispositivosWifi) obj;
		return Objects.equals(mac, other.mac);
	}
	@Override
	public String toString() {
		return "DispositivosWifi [id=" + id + ", mac=" + mac + ", estadoW=" + estadoW + ", fechaActualizacion="
				+ fechaActualizacion + "]";
	}
	
	abstract void conectarInternet();
	
	abstract boolean pendienteActualización();
	
	abstract void apagar();
	
}
