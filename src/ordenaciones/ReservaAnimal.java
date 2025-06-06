package ordenaciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ReservaAnimal {

	private String nombre;
	private String lugar;
	private double presupuesto_anual;
	private List<Animal> animales;
	
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
	public List<Animal> getAnimales() {
		return animales;
	}
	public void setAnimales(List<Animal> animales) {
		this.animales = animales;
	}
	@Override
	public String toString() {
		return "ReservaAnimal [nombre=" + nombre + ", lugar=" + lugar + ", presupuesto_anual=" + presupuesto_anual
				+ ", animales=" + animales + "]";
	}
	public ReservaAnimal(String nombre, String lugar, double presupuesto_anual) {
		super();
		this.nombre = nombre;
		this.lugar = lugar;
		this.presupuesto_anual = presupuesto_anual;
		this.animales = new ArrayList<>();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre, lugar);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReservaAnimal other = (ReservaAnimal) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	public List<Animal> agregarAnimal(Animal a){
		animales.add(a);
		Collections.sort(animales);
		System.out.println(a + " ha sido añadido");
		return animales;
	}
	
	public void mostrarInformacion(Animal a){
		System.out.println(a.getNombre() + " " + a.getFecha_nacimiento() + " " + a.getMedio() + " " + a.getComida());
	}
}
