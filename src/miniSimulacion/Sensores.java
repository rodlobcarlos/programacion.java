package miniSimulacion;

import java.util.Objects;

public class Sensores extends Coches{
	private int distanciaObstaculo;
	private int velocidad;
	
	protected int getDistanciaObstaculo() {
		return distanciaObstaculo;
	}
	protected void setDistanciaObstaculo(int distanciaObstaculo) {
		this.distanciaObstaculo = distanciaObstaculo;
	}
	protected int getVelocidad() {
		return velocidad;
	}
	protected void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(distanciaObstaculo, velocidad);
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
		Sensores other = (Sensores) obj;
		return distanciaObstaculo == other.distanciaObstaculo && velocidad == other.velocidad;
	}
	
	@Override
	public String toString() {
		return "Sensores [distanciaObstaculo=" + distanciaObstaculo + ", velocidad=" + velocidad + "]";
	}
	
	public Sensores(String nombre, int añosExperiencia, String marca, String modelo, String matricula,
			Conductores dueño, boolean apagado, boolean arrancado, boolean averia, int distanciaObstaculo,
			int velocidad) {
		super(nombre, añosExperiencia, marca, modelo, matricula, dueño, apagado, arrancado, averia);
		this.distanciaObstaculo = distanciaObstaculo;
		this.velocidad = velocidad;
	}
	
	boolean avisarObstaculo(int distanciaObstaculo) {
		boolean avisar;
		if (distanciaObstaculo < 50) {
			avisar = true;
		}else {
			avisar = false;
		}
		return avisar;
	}
	
	boolean avisarVelocidad(int velocidad) {
		boolean avisar;
		if (velocidad > 120) {
			avisar = true;
		}else {
			avisar = false;
		}
		return avisar;
	}
}
