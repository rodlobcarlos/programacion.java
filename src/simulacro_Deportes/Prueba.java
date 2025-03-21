package simulacro_Deportes;

import java.time.LocalDate;
import java.util.Date;

public class Prueba {
	private int id;
	private String lugar;
	private Date fecha;
	private EstadoPrueba estado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public EstadoPrueba getEstado() {
		return estado;
	}
	public void setEstado(EstadoPrueba estado) {
		this.estado = estado;
	}
	public Prueba(int id, String lugar, Date fecha, EstadoPrueba estado) {
		super();
		this.id = id;
		this.lugar = lugar;
		this.fecha = fecha;
		this.estado = estado;
	}
	public Prueba(String string, String lugar2, LocalDate now, EstadoPrueba planificada) {
	}
	@Override
	public String toString() {
		return "Prueba [id=" + id + ", lugar=" + lugar + ", fecha=" + fecha + ", estado=" + estado + "]";
	}
	
	
	
	
}
