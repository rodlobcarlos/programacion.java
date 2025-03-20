package simlacroInterfaces;

public abstract class Vehiculo implements Alquilable{
	private int id;
	private Alquiler [] alquileres;
	private boolean alquilado_o_no;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Alquiler[] getAlquileres() {
		return alquileres;
	}
	public void setAlquileres(Alquiler[] alquileres) {
		this.alquileres = alquileres;
	}
	public boolean isAlquilado_o_no() {
		return alquilado_o_no;
	}
	public void setAlquilado_o_no(boolean alquilado_o_no) {
		this.alquilado_o_no = alquilado_o_no;
	}
	
	abstract float getImporteTotalGenerado();
	abstract float getPrecioPorDia();
}
