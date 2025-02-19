package actsOrientacionObj;

import java.time.LocalDate;
import java.util.Objects;

public class Incidentes {
	private int identificadorNum;
	private String nombreIncidente;
	private String descripcion;
	private LocalDate fechaRegisto;
	private LocalDate fechaCierre;
	private Estado estado;
	private Criticidad criticidad;
	private Equipos equipo;
	
	protected Equipos getEquipo() {
		return equipo;
	}
	protected void setEquipo(Equipos equipo) {
		this.equipo = equipo;
	}
	protected int getIdentificadorNum() {
		return identificadorNum;
	}
	protected void setIdentificadorNum(int identificadorNum) {
		this.identificadorNum = identificadorNum;
	}
	protected String getNombreIncidente() {
		return nombreIncidente;
	}
	protected void setNombreIncidente(String nombreIncidente) {
		this.nombreIncidente = nombreIncidente;
	}
	protected String getDescripcion() {
		return descripcion;
	}
	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	protected LocalDate getFechaRegisto() {
		return fechaRegisto;
	}
	protected void setFechaRegisto(LocalDate fechaRegisto) {
		this.fechaRegisto = fechaRegisto;
	}
	protected LocalDate getFechaCierre() {
		return fechaCierre;
	}
	protected void setFechaCierre(LocalDate fechaCierre) {
		if (this.estado == Estado.CERRADA) {
			this.fechaCierre = fechaCierre;
		}else {
			this.fechaCierre = null;
		}
	}
	protected Estado getEstado() {
		return estado;
	}
	protected void setEstado(Estado estado) {
		if (estado.equals(Estado.CERRADA)) {
			this.estado = estado;
			this.fechaCierre = LocalDate.now();
		}
	}
	protected Criticidad getCriticidad() {
		return criticidad;
	}
	protected void setCriticidad(Criticidad criticidad) {
		this.criticidad = criticidad;
	}
	protected Equipos getIncidenteEquipo() {
		return equipo;
	}
	protected void setIncidenteEquipo(Equipos equipo) {
		this.equipo = equipo;
	}
	
	public Incidentes(int identificadorNum, String nombreIncidente, String descripcion, LocalDate fechaRegisto,
			LocalDate fechaCierre, Estado estado, Criticidad criticidad, Equipos equipo, LocalDate hoy) {
		super();
		this.identificadorNum = identificadorNum;
		this.nombreIncidente = nombreIncidente;
		this.descripcion = descripcion;
		this.fechaRegisto = fechaRegisto;
		this.fechaCierre = fechaCierre;
		this.estado = estado;
		this.criticidad = criticidad;
		this.equipo = equipo;
		this.hoy = hoy;
	}
	@Override
	public int hashCode() {
		return Objects.hash(criticidad, descripcion, equipo, estado, fechaCierre, fechaRegisto, hoy, identificadorNum,
				nombreIncidente);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incidentes other = (Incidentes) obj;
		return criticidad == other.criticidad && Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(equipo, other.equipo) && estado == other.estado
				&& Objects.equals(fechaCierre, other.fechaCierre) && Objects.equals(fechaRegisto, other.fechaRegisto)
				&& Objects.equals(hoy, other.hoy) && identificadorNum == other.identificadorNum
				&& Objects.equals(nombreIncidente, other.nombreIncidente);
	}
	
	@Override
	public String toString() {
		return "Incidentes [nombreIncidente=" + nombreIncidente + ", fechaRegisto=" + fechaRegisto + ", estado="
				+ estado + ", criticidad=" + criticidad + ", incidenteEquipo=" + equipo + "]";
	}
	
	public Incidentes(int identificadorNum, String nombreIncidente, String descripcion, LocalDate fechaRegisto,
			LocalDate fechaCierre, Estado estado, Criticidad criticidad, Equipos equipo) {
		super();
		this.identificadorNum = identificadorNum;
		this.nombreIncidente = nombreIncidente;
		this.descripcion = descripcion;
		this.fechaRegisto = fechaRegisto;
		setFechaCierre(fechaCierre);
		setEstado(estado);
		this.criticidad = criticidad;
		this.equipo = equipo;
	}

	LocalDate hoy = LocalDate.now();
	protected boolean esUrgente() {
		boolean urgente = false;
		if (criticidad.equals(Criticidad.CRITICA)) {
			urgente = true;
		}else if (criticidad.equals(Criticidad.GRAVE) && fechaRegisto.plusDays(7).isAfter(hoy)) {
			urgente = true;
		}else if (criticidad.equals(Criticidad.MEDIA) && fechaRegisto.plusDays(30).isAfter(hoy)) {
			urgente = true;
		}else {
			urgente = false;
		}
		return urgente;
	}
}
