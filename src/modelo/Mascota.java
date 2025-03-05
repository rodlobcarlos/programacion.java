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
	private String tipo;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getNombreEspecie() {
		return nombreEspecie;
	}

	public void setNombreEspecie(String nombreEspecie) {
		this.nombreEspecie = nombreEspecie;
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", getClass()=" + getClass() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println(this.getClass().getName());
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mascota other = (Mascota) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre) && Objects.equals(tipo, other.tipo);
	}

	public abstract boolean habla();
	
	public abstract void muestra(Mascota m);
	
	LocalDate cumpleaños(LocalDate fecha) {
		return fecha;
		
	}
	
	/*boolean morir() {
		boolean estaVivo = false;
		if() {
		}
		return estaVivo;
	}*/
}
