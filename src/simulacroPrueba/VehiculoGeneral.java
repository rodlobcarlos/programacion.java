package simulacroPrueba;

import java.util.Arrays;

public abstract class VehiculoGeneral implements IAalquilable {
	private int id;
	private Alquiler [] alquileres;
	private boolean disponible;
	
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
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	public VehiculoGeneral(int id, Alquiler[] alquileres, boolean disponible) {
		super();
		this.id = id;
		this.alquileres = alquileres;
		this.disponible = disponible;
	}
	
	@Override
	public boolean estaAlquilado() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public double getPrecioDia() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	abstract float getImporteTotalGenerado();
}
