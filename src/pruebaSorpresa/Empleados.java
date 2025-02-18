package pruebaSorpresa;

import java.util.Objects;

public class Empleados {
	protected String nombre;
	protected String DNI;
	protected int salarioBase;
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getDNI() {
		return DNI;
	}
	protected void setDNI(String dNI) {
		DNI = dNI;
	}
	protected float getSalarioBase() {
		return salarioBase;
	}
	protected void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(DNI, nombre, salarioBase);
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
		return Objects.equals(DNI, other.DNI) && Objects.equals(nombre, other.nombre)
				&& Float.floatToIntBits(salarioBase) == Float.floatToIntBits(other.salarioBase);
	}
	
	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", DNI=" + DNI + ", salarioBase=" + salarioBase + "]";
	}

	public Empleados(String nombre, String dNI, int salarioBase) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.salarioBase = salarioBase;
	}
	
	boolean igualEmpleado(Empleados e) {
		boolean DNIigual = false;
		if (e.DNI.equals(DNI)) {
			DNIigual = true;
			System.out.println("El empleado es el mismo.");
		}else {
			System.out.println("El empleado no es el mismo.");
		}
		return DNIigual;
	}
	
	int salarioMin = 1134;
	float validarSalario() {
		if (salarioBase > 0) {
			System.out.println("Error. El salario es menor que 0");
			salarioMin = 1134;
		}else {
			System.out.println("El salario este por encima de 0 " + salarioBase);
		}
		return salarioMin;
	}
}
