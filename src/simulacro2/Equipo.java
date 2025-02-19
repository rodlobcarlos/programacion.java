package simulacro2;

import java.util.Objects;

public class Equipo {
	private String direccionMac;
	private String sistemaOp;
	private int numIncidentes;
	private String nombre;
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getDireccionMac() {
		return direccionMac;
	}
	protected void setDireccionMac(String direccionMac) {
		this.direccionMac = direccionMac;
	}
	protected String getSistemaOp() {
		return sistemaOp;
	}
	protected void setSistemaOp(String sistemaOp) {
		this.sistemaOp = sistemaOp;
	}
	protected int getNumIncidentes() {
		return numIncidentes;
	}
	protected void setNumIncidentes(int numIncidentes) {
		this.numIncidentes = numIncidentes;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(direccionMac, nombre, numIncidentes, sistemaOp);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(direccionMac, other.direccionMac);
	}
	
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + "direccionMac=" + direccionMac + ", sistemaOp=" + sistemaOp + "numIncidentes="
		+ "numIncidentes]";
	}
	
	public Equipo(String direccionMac, String sistemaOp, int numIncidentes, String nombre) {
		super();
		this.direccionMac = direccionMac;
		this.sistemaOp = sistemaOp;
		this.numIncidentes = numIncidentes;
		this.nombre = nombre;
	}
}