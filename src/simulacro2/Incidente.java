package simulacro2;

import java.time.LocalDate;
import java.util.Objects;

public class Incidente {
	private String identificadorNum;
	private String nombre;
	private String descripcion;
	private LocalDate fechaRegistro;
	private LocalDate fechaCierre;
	private Estado estado;
	private Criticidad criticidad;
	private Equipo equipoIncidente;

	protected String getIdentificadorNum() {
		return identificadorNum;
	}

	protected void setIdentificadorNum(String identificadorNum) {
		this.identificadorNum = identificadorNum;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getDescripcion() {
		return descripcion;
	}

	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	protected LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	protected void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	protected LocalDate getFechaCierre() {
		return fechaCierre;
	}

	protected void setFechaCierre(LocalDate fechaCierre) {
		if (this.estado.equals(Estado.CERRADA)) {
			this.fechaCierre = fechaCierre;

		} else {
			this.fechaCierre = null;
		}
	}

	protected Estado getEstado() {
		return estado;
	}

	protected void setEstado(Estado estado) {
		this.estado = estado;
		if (estado.equals(Estado.CERRADA))
			this.fechaCierre = LocalDate.now();
	}

	protected Criticidad getCriticidad() {
		return criticidad;
	}

	protected void setCriticidad(Criticidad criticidad) {
		this.criticidad = criticidad;
	}

	protected Equipo getEquipoIncidente() {
		return equipoIncidente;
	}

	protected void setEquipoIncidente(Equipo equipoIncidente) {
		this.equipoIncidente = equipoIncidente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(criticidad, descripcion, equipoIncidente, estado, fechaCierre, fechaRegistro,
				identificadorNum, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incidente other = (Incidente) obj;
		return criticidad == other.criticidad && Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(equipoIncidente, other.equipoIncidente) && estado == other.estado
				&& Objects.equals(fechaCierre, other.fechaCierre) && Objects.equals(fechaRegistro, other.fechaRegistro)
				&& Objects.equals(identificadorNum, other.identificadorNum) && Objects.equals(nombre, other.nombre);
	}

	

	@Override
	public String toString() {
		return "Incidente [nombre=" + nombre + ", fechaRegistro=" + fechaRegistro + ", estado=" + estado
				+ ", criticidad=" + criticidad + ", equipoIncidente=" + equipoIncidente + "]";
	}

	public Incidente(String identificadorNum, String nombre, String descripcion, LocalDate fechaRegistro,
			LocalDate fechaCierre, Estado estado, Criticidad criticidad, Equipo equipoIncidente) {
		super();
		this.identificadorNum = identificadorNum;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaRegistro = fechaRegistro;
		this.setFechaCierre(fechaCierre);
		this.setEstado(estado);
		this.criticidad = criticidad;
		this.equipoIncidente = equipoIncidente;
	}
	LocalDate hoy = LocalDate.now();
		boolean urgente = false;
	boolean esUrgente() {
		if(criticidad.equals(Criticidad.CRITICA)) {
			urgente = true;
		}else if (criticidad.equals(Criticidad.GRAVE) && this.fechaRegistro.plusDays(7).isAfter(hoy)) {
			urgente = true;
		}else if (criticidad.equals(Criticidad.MEDIA) && this.fechaRegistro.plusDays(30).isAfter(hoy)){
			urgente = true;
		}
		return urgente;
	}
}
