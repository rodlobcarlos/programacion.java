package boletin_5;

import java.util.Objects;

public class Planetas extends Astros {
	private int distanciaSol;
	private int orbitaSol;
	private boolean tieneSatelites;
	
	protected int getDistanciaSol() {
		return distanciaSol;
	}
	protected void setDistanciaSol(int distanciaSol) {
		this.distanciaSol = distanciaSol;
	}
	protected int getOrbitaSol() {
		return orbitaSol;
	}
	protected void setOrbitaSol(int orbitaSol) {
		this.orbitaSol = orbitaSol;
	}
	protected boolean isTieneSatelites() {
		return tieneSatelites;
	}
	protected void setTieneSatelites(boolean tieneSatelites) {
		this.tieneSatelites = tieneSatelites;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(distanciaSol, orbitaSol, tieneSatelites);
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
		Planetas other = (Planetas) obj;
		return distanciaSol == other.distanciaSol && orbitaSol == other.orbitaSol
				&& tieneSatelites == other.tieneSatelites;
	}
	
	@Override
	public String toString() {
		return "Planetas [distanciaSol=" + distanciaSol + ", orbitaSol=" + orbitaSol + ", tieneSatelites="
				+ tieneSatelites + ", nombreAstro=" + getNombre() + "]";
	}
	
	public Planetas(double radioEcuatorial, int rotacionSobreEje, int masa, int tempMedia, int gravedad, String nombre,
			int distanciaSol, int orbitaSol, boolean tieneSatelites) {
		super(radioEcuatorial, rotacionSobreEje, masa, tempMedia, gravedad, nombre);
		this.distanciaSol = distanciaSol;
		this.orbitaSol = orbitaSol;
		this.tieneSatelites = tieneSatelites;
	}
	
	
}
