package repasoTiendaAnimales_modelo;

import java.time.LocalDate;

public abstract class Mascotas {
	private String nombre;
	private int edad;
	private String estado;
	private LocalDate fecha_nacimiento;
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected int getEdad() {
		return edad;
	}
	protected void setEdad(int edad) {
		this.edad = edad;
	}
	protected String getEstado() {
		return estado;
	}
	protected void setEstado(String estado) {
		this.estado = estado;
	}
	protected LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	protected void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	@Override
	public String toString() {
		return "Mascotas [nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", fecha_nacimiento="
				+ fecha_nacimiento + "]";
	}
	public Mascotas(String nombre, int edad, String estado, LocalDate fecha_nacimiento) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	abstract boolean habla();
	abstract boolean morir();
	abstract void cumpleaños(LocalDate cumpleaños);
}
