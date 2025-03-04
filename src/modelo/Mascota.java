package modelo;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Mascota {
	private String nombre;
	private int edad;
	private String estado;
	private LocalDate fechaNacimiento;
	private float peso;
	private String nombreEspecie;
	
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", getClass()=" + getClass() + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mascota other = (Mascota) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}

	public abstract boolean habla();
	
	public abstract void muestra(Mascota m);
	
	LocalDate cumpleaños(LocalDate fecha) {
		return fecha;
		
	}
	
	boolean morir() {
		boolean estaVivo = false;
		return estaVivo;
	}
}
