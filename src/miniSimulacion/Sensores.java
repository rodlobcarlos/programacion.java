package miniSimulacion;

import java.util.Objects;

public class Sensores{
	private int distanciaObstaculo;
	private int velocidad;
	
	
	public Sensores(int distanciaObstaculo, int velocidad) {
		super();
		this.distanciaObstaculo = distanciaObstaculo;
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Sensores [distanciaObstaculo=" + distanciaObstaculo + ", velocidad=" + velocidad + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(distanciaObstaculo, velocidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sensores other = (Sensores) obj;
		return distanciaObstaculo == other.distanciaObstaculo && velocidad == other.velocidad;
	}

	public int getDistanciaObstaculo() {
		return distanciaObstaculo;
	}

	public void setDistanciaObstaculo(int distanciaObstaculo) {
		this.distanciaObstaculo = distanciaObstaculo;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	 boolean avisarObstaculo(int distanciaObstaculo, EstadoCoche estado) {
		boolean avisar;
		if (distanciaObstaculo < 50) {
			avisar = true;
			EstadoCoche apagado = EstadoCoche.apagado;
			System.out.println(apagado);
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
