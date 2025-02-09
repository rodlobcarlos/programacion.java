package boletin_3;

import java.time.LocalDate;

public class Persona {
	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fecha_nacimiento;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	public Persona(String dni, String nombre, String apellidos, LocalDate fecha_nacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	public void mayorDeEdad(LocalDate fecha_nacimiento) {

		if () {
		}
	}
}