package gestionEmpleados;

class Administrativo extends Empleado {
	protected int extraProductividad;
	protected int salarioTotal;

	public Administrativo(String dni, String nombre, int salarioBase, int extraProductividad) {
		super(dni, nombre, salarioBase);
		this.extraProductividad = extraProductividad;
		setSalarioTotal(salarioTotal);
	}

	protected int getExtraProductividad() {
		return extraProductividad;
	}

	protected void setExtraProductividad(int extraProductividad) {
		this.extraProductividad = extraProductividad;
	}

	protected int getSalarioTotal() {
		return salarioTotal;
	}

	protected void setSalarioTotal(int salarioTotal) {
		this.salarioTotal = this.salarioBase + this.extraProductividad;
	}

	@Override
	void calcularSalario() {
		int salario = 0;
		salario = this.salarioTotal;
		System.out.println("El salario total es: " + salario);
	}
	
	@Override
	public String toString() {
		return "DNI: " + dni + "- Nombre: " + nombre + "- Salario: " + salarioTotal;
	}
}
