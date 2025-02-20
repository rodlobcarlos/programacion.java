package rodriguez_carlos2;

import java.time.LocalDate;
import java.util.Objects;

public class Clientes {
	private String DNI;
	private String nombre;
	private String apellidos;
	private int edad;
	private TipoDieta dietaAsignada;
	private LocalDate fechaInscripcion;
	private boolean clienteVip;
	
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
	protected String getApellidos() {
		return apellidos;
	}
	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	protected int getEdad() {
		return edad;
	}
	protected void setEdad(int edad) {
		this.edad = edad;
	}
	protected TipoDieta getDietaAsignada() {
		return dietaAsignada;
	}
	protected void setDietaAsignada(TipoDieta dietaAsignada) {
		this.dietaAsignada = dietaAsignada;
	}
	protected LocalDate getFechaInscripcion() {
		return fechaInscripcion;
	}
	protected void setFechaInscripcion(LocalDate fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	protected boolean isClienteVip() {
		return clienteVip;
	}
	protected void setClienteVip(boolean clienteVip) {
		this.clienteVip = clienteVip;
	}
	@Override
	public int hashCode() {
		return Objects.hash(DNI, apellidos, clienteVip, dietaAsignada, edad, fechaInscripcion, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clientes other = (Clientes) obj;
		return Objects.equals(DNI, other.DNI) && Objects.equals(apellidos, other.apellidos)
				&& clienteVip == other.clienteVip && dietaAsignada == other.dietaAsignada && edad == other.edad
				&& Objects.equals(fechaInscripcion, other.fechaInscripcion) && Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Clientes [DNI=" + DNI + "]";
	}
	public Clientes(String dNI, String nombre, String apellidos, int edad, TipoDieta dietaAsignada,
			LocalDate fechaInscripcion, boolean clienteVip) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dietaAsignada = dietaAsignada;
		this.fechaInscripcion = fechaInscripcion;
		this.clienteVip = clienteVip;
	}
	
	
}
