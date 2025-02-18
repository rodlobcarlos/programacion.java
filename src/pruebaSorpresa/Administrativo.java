package pruebaSorpresa;

import java.util.Objects;

public class Administrativo extends Empleados{
	protected int extraProductividad;

	protected float getExtraProductividad() {
		return extraProductividad;
	}

	protected void setExtraProductividad(int extraProductividad) {
		this.extraProductividad = extraProductividad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(extraProductividad);
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
		Administrativo other = (Administrativo) obj;
		return Float.floatToIntBits(extraProductividad) == Float.floatToIntBits(other.extraProductividad);
	}

	@Override
	public String toString() {
		return "Administrativo [extraProductividad=" + extraProductividad + ", nombre=" + nombre + ", DNI=" + DNI
				+ ", salarioBase=" + salarioBase + "]";
	}

	public Administrativo(String nombre, String dNI, int salarioBase, int extraProductividad) {
		super(nombre, dNI, salarioBase);
		this.extraProductividad = extraProductividad;
	}
	
	int calcularSalarioAd(Empleados e1) {
		int calculo = e1.salarioBase + extraProductividad;
		return calculo;
	}
}
