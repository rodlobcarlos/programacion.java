package actsOrientacionObj;

import java.util.Objects;

public class Equipos {
	private String nombreEquipo;
	private String direccionMac;
	private String sistemaOp;
	private int numIncidentes;
	
	protected String getNombreEquipo() {
		return nombreEquipo;
	}
	protected void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
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
		return Objects.hash(direccionMac, nombreEquipo, numIncidentes, sistemaOp);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipos other = (Equipos) obj;
		return Objects.equals(direccionMac, other.direccionMac);
	}
	
	@Override
	public String toString() {
		return "Equipos [nombreEquipo=" + nombreEquipo + ", direccionMac=" + direccionMac + ", sistemaOp=" + sistemaOp
				+ ", numIncidentes=" + numIncidentes + "]";
	}
	public Equipos(String nombreEquipo, String direccionMac, String sistemaOp, int numIncidentes) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.direccionMac = direccionMac;
		this.sistemaOp = sistemaOp;
		this.numIncidentes = numIncidentes;
	}
	
	
}
