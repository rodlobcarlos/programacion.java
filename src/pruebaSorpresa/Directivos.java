package pruebaSorpresa;

import java.util.Objects;

public class Directivos extends Empleados{
	protected float bonificacion;

	protected float getBonificacion() {
		return bonificacion;
	}

	protected void setBonificacion(float bonificacion) {
		this.bonificacion = bonificacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(bonificacion);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directivos other = (Directivos) obj;
		return Float.floatToIntBits(bonificacion) == Float.floatToIntBits(other.bonificacion);
	}

	@Override
	public String toString() {
		return "Directivos [bonificacion=" + bonificacion + ", nombre=" + getNombre() + ", DNI=" + getDNI()
				+ ", salario base=" + getSalarioBase() + "]";
	}

	public Directivos(String nombre, String dNI, int salarioBase, float bonificacion) {
		super(nombre, dNI, salarioBase);
		this.bonificacion = bonificacion;
	}

	double calculoSalarioDir(Empleados e2) {
		double calculo = e2.salarioBase + 2.5;
		return calculo;
	}
}
