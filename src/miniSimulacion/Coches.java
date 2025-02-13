package miniSimulacion;

import java.util.Objects;

public class Coches extends Conductores {
	private String marca;
	private String modelo;
	private String matricula;
	private Conductores dueño;
	private boolean apagado;
	private boolean arrancado;
	private boolean averia;
	
	protected boolean getApagado() {
		return apagado;
	}
	protected void setApagado(boolean apagado) {
		this.apagado = apagado;
	}
	protected boolean getArrancado() {
		return arrancado;
	}
	protected void setArrancado(boolean arrancado) {
		this.arrancado = arrancado;
	}
	protected boolean getAveria() {
		return averia;
	}
	protected void setAveria(boolean averia) {
		this.averia = averia;
	}
	protected String getMarca() {
		return marca;
	}
	protected void setMarca(String marca) {
		this.marca = marca;
	}
	protected String getModelo() {
		return modelo;
	}
	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}
	protected String getMatricula() {
		return matricula;
	}
	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	protected Conductores getDueño() {
		return dueño;
	}
	protected void setDueño(Conductores dueño) {
		this.dueño = dueño;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(apagado, arrancado, averia, dueño, marca, matricula, modelo);
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
		Coches other = (Coches) obj;
		return Objects.equals(apagado, other.apagado) && Objects.equals(arrancado, other.arrancado)
				&& Objects.equals(averia, other.averia) && Objects.equals(dueño, other.dueño)
				&& Objects.equals(marca, other.marca) && Objects.equals(matricula, other.matricula)
				&& Objects.equals(modelo, other.modelo);
	}
	
	@Override
	public String toString() {
		return "Coches [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", dueño=" + dueño
				+ ", apagado=" + apagado + ", arrancado=" + arrancado + ", averia=" + averia + "]";
	}
	
	public Coches(String nombre, int añosExperiencia, String marca, String modelo, String matricula, Conductores dueño,
			boolean apagado, boolean arrancado, boolean averia) {
		super(nombre, añosExperiencia);
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.dueño = dueño;
		this.apagado = apagado;
		this.arrancado = arrancado;
		this.averia = averia;
	}
	
	boolean fasePrueba(String coche, String dueño) {
		boolean puedeConducir;
		if (coche == dueño) {
			puedeConducir = true;
		}else {
			puedeConducir = false;
		}
		return puedeConducir;
		
	}
}
