package miniSimulacion;

import java.util.Objects;

public class Conductores {
	private String nombre;
	private int añosExperiencia;
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected int getAñosExperiencia() {
		return añosExperiencia;
	}
	protected void setAñosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
	}
	@Override
	public int hashCode() {
		return Objects.hash(añosExperiencia, nombre);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conductores other = (Conductores) obj;
		return añosExperiencia == other.añosExperiencia && Objects.equals(nombre, other.nombre);
	}
	
	@Override
	public String toString() {
		return "Conductores [nombre=" + nombre + ", añosExperiencia=" + añosExperiencia + "]";
	}
	
	public Conductores(String nombre, int añosExperiencia) {
		super();
		this.nombre = nombre;
		this.añosExperiencia = añosExperiencia;
	}
	
	public void conducir() {
		System.out.println("Carlos conduciendo");
	}
}
