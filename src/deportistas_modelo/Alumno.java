package deportistas_modelo;

import java.util.Objects;

public class Alumno	{
	private String nombre;
	private String DNI;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	@Override
	public int hashCode() {
		return Objects.hash(DNI, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(DNI, other.DNI) && Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", DNI=" + DNI + "]";
	}
	public Alumno(String nombre, String dNI) {
		super();
		this.nombre = nombre;
		DNI = dNI;
	}
}
