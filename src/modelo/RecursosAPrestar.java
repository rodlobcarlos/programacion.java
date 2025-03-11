package modelo;

public abstract class RecursosAPrestar implements IPrestable{
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
	public String toString() {
		return "RecursosAPrestar [id=" + id + ", ubicacion=" + ubicacion + "]";
	}
	
	public RecursosAPrestar(int id, String ubicacion) {
		super();
		this.id = id;
		this.ubicacion = ubicacion;
	}
}
