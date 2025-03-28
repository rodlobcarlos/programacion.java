package listas1_0;

import java.util.Objects;

public class Provincia {
	private String nombre;
	private double poblacion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(double poblacion) {
		this.poblacion = poblacion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Provincia other = (Provincia) obj;
		return Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Provincia [nombre=" + nombre + ", poblacion=" + poblacion + "]";
	}
	public Provincia(String nombre, double poblacion) {
		super();
		this.nombre = nombre;
		this.poblacion = poblacion;
	}
}
