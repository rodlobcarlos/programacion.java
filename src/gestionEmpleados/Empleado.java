package gestionEmpleados;

import java.util.Objects;

public class Empleado {
	protected String dni;
	protected String nombre;
	protected int salarioBase;

	public Empleado(String dni, String nombre, int salarioBase) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		setSalarioBase(salarioBase);
	}

	@Override
	public String toString() {
		return "DNI: " + dni + "- Nombre: " + nombre + "- Salario: " + salarioBase;
	}

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getSalarioBase() {
		return salarioBase;
	}

	protected void setSalarioBase(int salarioBase) {
		if (salarioBase < 0) {
			System.out.println("Error. El salario base no puede ser negativo. SMI Asignado");
			this.salarioBase = 1134;
		} else {
			this.salarioBase = salarioBase;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(dni, other.dni);
	}

	void calcularSalario() {
		int salario = 0;
		salario = this.salarioBase;
		System.out.println("El salario total es: " + salario);
	}

}
