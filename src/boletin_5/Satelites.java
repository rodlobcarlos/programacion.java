package boletin_5;

import java.util.Objects;

public class Satelites extends Astros{
	private double distanciaPlaneta;
	private int orbitaPlanetaria;
	private Planetas planeta;
	
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
	protected Planetas getPlaneta() {
		return planeta;
	}
	protected void setPlaneta(Planetas planeta) {
		this.planeta = planeta;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(distanciaPlaneta, orbitaPlanetaria, planeta);
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
				&& orbitaPlanetaria == other.orbitaPlanetaria && Objects.equals(planeta, other.planeta);
	}
	@Override
	public String toString() {
		return "Satelites [distanciaPlaneta=" + distanciaPlaneta + ", orbitaPlanetaria=" + orbitaPlanetaria
				+ ", planeta=" + planeta + "]";
	}
	public Satelites(double radioEcuatorial, int rotacionSobreEje, int masa, int tempMedia, int gravedad, String nombre,
			double distanciaPlaneta, int orbitaPlanetaria, Planetas planeta) {
		super(radioEcuatorial, rotacionSobreEje, masa, tempMedia, gravedad, nombre);
		this.distanciaPlaneta = distanciaPlaneta;
		this.orbitaPlanetaria = orbitaPlanetaria;
		this.planeta = planeta;
	}
	
	void muestraInformacion(Object objeto) {
		System.out.println("Distancia al planeta: " + distanciaPlaneta);
		System.out.println("Orbita planetaria: " + orbitaPlanetaria);
		System.out.println("Planeta al que pertenece: " + planeta);
	}
}	
