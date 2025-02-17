package boletin_5;

import java.util.Objects;

public class Satelites extends Astros{
	private double distanciaPlaneta;
	private int orbitaPlanetaria;
	private String planetaPerteneciente;
	
	protected double getDistanciaPlaneta() {
		return distanciaPlaneta;
	}
	protected void setDistanciaPlaneta(double distanciaPlaneta) {
		this.distanciaPlaneta = distanciaPlaneta;
	}
	protected int getOrbitaPlanetaria() {
		return orbitaPlanetaria;
	}
	protected void setOrbitaPlanetaria(int orbitaPlanetaria) {
		this.orbitaPlanetaria = orbitaPlanetaria;
	}
	protected String getPlanetaPerteneciente() {
		return planetaPerteneciente;
	}
	protected void setPlanetaPerteneciente(String planetaPerteneciente) {
		this.planetaPerteneciente = planetaPerteneciente;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(distanciaPlaneta, orbitaPlanetaria, planetaPerteneciente);
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
		Satelites other = (Satelites) obj;
		return Double.doubleToLongBits(distanciaPlaneta) == Double.doubleToLongBits(other.distanciaPlaneta)
				&& orbitaPlanetaria == other.orbitaPlanetaria
				&& Objects.equals(planetaPerteneciente, other.planetaPerteneciente);
	}
	@Override
	public String toString() {
		return "Satelites [distanciaPlaneta=" + distanciaPlaneta + ", orbitaPlanetaria=" + orbitaPlanetaria
				+ ", planetaPerteneciente=" + planetaPerteneciente + ", distanciaPlanteta=" + getDistanciaPlaneta()
				+ ", nombrePlaneta=" + getPlanetaPerteneciente() + "]";
	}
	
	
}	
