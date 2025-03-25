package simulacroNuevo_modelo;

import java.util.Objects;

import modelo.Empleado;

public abstract class Empleados {
	private String DNI;
	private String nombre;
	protected int sueldo;
	private Puesto puesto;
	
	public Puesto getPuesto() {
		return puesto;
	}
	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSueldo() {
		return sueldo;
	}
	public int setSueldo(int sueldo) {
		return this.sueldo = sueldo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(DNI);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleados other = (Empleados) obj;
		return Objects.equals(DNI, other.DNI);
	}
	
	public Empleados(String dNI, String nombre, int sueldo, Puesto puesto) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.puesto = puesto;
	}
	
	abstract int sueldo(Empleado e);
}
