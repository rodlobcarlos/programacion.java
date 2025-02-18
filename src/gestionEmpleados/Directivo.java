package gestionEmpleados;

final class Directivo extends Empleado {
	protected int bonoPorcentaje;
	protected int salarioTotal;

	public Directivo(String dni, String nombre, int salarioBase, int bonoPorcentaje) {
		super(dni, nombre, salarioBase);
		this.bonoPorcentaje = bonoPorcentaje;
		setSalarioTotal(salarioTotal);
	}

	protected int getBonoPorcentaje() {
		return bonoPorcentaje;
	}

	protected void setBonoPorcentaje(int bonoPorcentaje) {
		this.bonoPorcentaje = bonoPorcentaje;
	}

	protected int getSalarioTotal() {
		return salarioTotal;
	}

	protected void setSalarioTotal(int salarioTotal) {
		this.salarioTotal = this.salarioBase + salarioBase * bonoPorcentaje / 100;
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
