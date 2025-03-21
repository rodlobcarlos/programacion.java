package simulacroVuelo_modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Vuelo {
	private int id;
	private String aerolinea;
	private String destino;
	private LocalDate fecha_vuelo;
	private int duracion;
	private EstadoVuelo estado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public LocalDate getFecha_vuelo() {
		return fecha_vuelo;
	}
	public void setFecha_vuelo(LocalDate fecha_vuelo) {
		this.fecha_vuelo = fecha_vuelo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public EstadoVuelo getEstado() {
		return estado;
	}
	public void setEstado(EstadoVuelo estado) {
		this.estado = estado;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vuelo other = (Vuelo) obj;
		return id == other.id;
	}
	
	public Vuelo(int id, String aerolinea, String destino, LocalDate fecha_vuelo, int duracion, EstadoVuelo estado) {
		super();
		this.id = id;
		this.aerolinea = aerolinea;
		this.destino = destino;
		this.fecha_vuelo = fecha_vuelo;
		this.duracion = duracion;
		this.estado = estado;
	}
	
	
}
