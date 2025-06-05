package ordenaciones;

import java.util.LinkedList;
import java.util.List;

public class ReservaAnimal implements Comparable<Animales> {

	private String nombre;
	private String lugar;
	private double presupuesto_anual;
	private List<Animales> listaAnimales;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public double getPresupuesto_anual() {
		return presupuesto_anual;
	}
	public void setPresupuesto_anual(double presupuesto_anual) {
		this.presupuesto_anual = presupuesto_anual;
	}
	public List<Animales> getListaAnimales() {
		return listaAnimales;
	}
	public void setListaAnimales(List<Animales> listaAnimales) {
		this.listaAnimales = listaAnimales;
	}
	
	public ReservaAnimal(String nombre, String lugar, double presupuesto_anual, List<Animales> listaAnimales) {
		super();
		this.nombre = nombre;
		this.lugar = lugar;
		this.presupuesto_anual = presupuesto_anual;
		this.listaAnimales = new LinkedList<Animales>();
	}
	
	@Override
	public int compareTo(Animales o) {
		return this.nombre.compareTo(o.getNombre());
	}
}
