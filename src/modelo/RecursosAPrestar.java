package modelo;

import java.util.Objects;

public abstract class RecursosAPrestar{
	private int id;
	private String ubicacion;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, ubicacion);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RecursosAPrestar other = (RecursosAPrestar) obj;
		return id == other.id && Objects.equals(ubicacion, other.ubicacion);
	}
	
	@Override
	public String toString() {
		return "RecursosAPrestar [id=" + id + ", ubicacion=" + ubicacion + "]";
	}
	
	public RecursosAPrestar(int id, String ubicacion) {
		super();
		this.id = id;
		this.ubicacion = ubicacion;
	}
	
	
}
