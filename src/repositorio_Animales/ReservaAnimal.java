package repositorio_Animales;

import java.util.Objects;
import java.util.Set;

import animales_modelo.Animal;

public class ReservaAnimal {
	private Set<Animal> animales;
	private String nombre;
	private String lugar;
	private float presupuestoAnimal;
	
	public Set<Animal> getAnimales() {
		return animales;
	}
	public void setAnimales(Set<Animal> animales) {
		this.animales = animales;
	}
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
	public float getPresupuestoAnimal() {
		return presupuestoAnimal;
	}
	public void setPresupuestoAnimal(float presupuestoAnimal) {
		this.presupuestoAnimal = presupuestoAnimal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(animales, lugar, nombre, presupuestoAnimal);
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
		return Objects.equals(animales, other.animales) && Objects.equals(lugar, other.lugar)
				&& Objects.equals(nombre, other.nombre)
				&& Float.floatToIntBits(presupuestoAnimal) == Float.floatToIntBits(other.presupuestoAnimal);
	}
	public ReservaAnimal(Set<Animal> animales, String nombre, String lugar, float presupuestoAnimal) {
		super();
		this.animales = animales;
		this.nombre = nombre;
		this.lugar = lugar;
		this.presupuestoAnimal = presupuestoAnimal;
	}
	
	
}
