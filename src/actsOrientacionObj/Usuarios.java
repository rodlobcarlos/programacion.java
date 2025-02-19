package actsOrientacionObj;

import java.util.Objects;

public class Usuarios {
	private String DNI;
	private String nombre;
	private String nombreDepartamento;
	
	protected String getDNI() {
		return DNI;
	}
	protected void setDNI(String dNI) {
		DNI = dNI;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getNombreDepartamento() {
		return nombreDepartamento;
	}
	protected void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}
	@Override
	public int hashCode() {
		return Objects.hash(DNI, nombre, nombreDepartamento);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuarios other = (Usuarios) obj;
		return Objects.equals(DNI, other.DNI);
	}
	@Override
	public String toString() {
		return "Usuarios [DNI=" + DNI + ", nombre=" + nombre + ", nombreDepartamento=" + nombreDepartamento + "]";
	}
	public Usuarios(String dNI, String nombre, String nombreDepartamento) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.nombreDepartamento = nombreDepartamento;
	}
}
