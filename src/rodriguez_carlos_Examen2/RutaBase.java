package rodriguez_carlos_Examen2;

import java.util.Objects;

public abstract class RutaBase{
	private int id;
	private String cuidadOrigen;
	private String ciudadDestino;
	private float distancia;
	
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected String getCuidadOrigen() {
		return cuidadOrigen;
	}
	protected void setCuidadOrigen(String cuidadOrigen) {
		this.cuidadOrigen = cuidadOrigen;
	}
	protected String getCiudadDestino() {
		return ciudadDestino;
	}
	protected void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}
	protected float getDistancia() {
		return distancia;
	}
	protected void setDistancia(float distancia) {
		this.distancia = distancia;
	}
	
	public RutaBase(int id, String cuidadOrigen, String ciudadDestino, float distancia) {
		super();
		this.id = id;
		this.cuidadOrigen = cuidadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.distancia = distancia;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RutaBase other = (RutaBase) obj;
		return id == other.id;
	}
}
