package reservas_eventos;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Repositorio_reservas {

	private Set<Usuario> listaReservas;
	private String nombre_evento;
	private LocalDate fecha_evento;
	private int id;
	private String lugar_celebracion;
	
	public Repositorio_reservas(Set<Reserva> listaReservas, String nombre_evento, LocalDate fecha_evento, int id,
			String lugar_celebracion) {
		super();
		this.listaReservas = new LinkedHashSet<Usuario>();
		this.nombre_evento = nombre_evento;
		this.fecha_evento = fecha_evento;
		this.id = id;
		this.lugar_celebracion = lugar_celebracion;
	}

	@Override
	public String toString() {
		return "Repositorio_reservas [listaReservas=" + listaReservas + ", nombre_evento=" + nombre_evento
				+ ", fecha_evento=" + fecha_evento + ", id=" + id + ", lugar_celebracion=" + lugar_celebracion + "]";
	}

	public Set<Usuario> getListaReservas() {
		return listaReservas;
	}

	public void setListaReservas(Set<Usuario> listaReservas) {
		this.listaReservas = listaReservas;
	}

	public String getNombre_evento() {
		return nombre_evento;
	}

	public void setNombre_evento(String nombre_evento) {
		this.nombre_evento = nombre_evento;
	}

	public LocalDate getFecha_evento() {
		return fecha_evento;
	}

	public void setFecha_evento(LocalDate fecha_evento) {
		this.fecha_evento = fecha_evento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLugar_celebracion() {
		return lugar_celebracion;
	}

	public void setLugar_celebracion(String lugar_celebracion) {
		this.lugar_celebracion = lugar_celebracion;
	}
	
	public boolean  altaUsurio(Usuario u) {
		boolean alta = false;
		if(listaReservas.contains(u.getId()) && listaReservas.contains(u.getNombre_completo()) 
				&& listaReservas.contains(u.getEmail())) {
			alta = true;
			listaReservas.add(u);
			System.out.println("Usuario dado de alta -> " + u);
		}
		return alta;
	}
	
	public Set<Usuario> listarUsuarios() {
		return listaReservas;
		
	}
}
