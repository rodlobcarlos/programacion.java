package boletin_5;

import java.util.Objects;

public class Personaje {
	private String nombre;
	private String arma;
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getArma() {
		return arma;
	}
	protected void setArma(String arma) {
		this.arma = arma;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(arma, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Objects.equals(arma, other.arma) && Objects.equals(nombre, other.nombre);
	}
	
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", arma=" + arma + "]";
	}
	
	public Personaje(String nombre, String arma) {
		super();
		this.nombre = nombre;
		this.arma = arma;
	}
	
	
}