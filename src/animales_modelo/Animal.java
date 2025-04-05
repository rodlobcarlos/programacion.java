package animales_modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Animal {
	private String nombre;
	private String id;
	private String especie;
	private int edad;
	private ClasificacionComida comida;
	private LocalDate fecha_nacimiento;
	private float peso;
	private Medio medio;
	private ClasificacionGestacion gestacion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public ClasificacionComida getComida() {
		return comida;
	}
	public void setComida(ClasificacionComida comida) {
		this.comida = comida;
	}
	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public Medio getMedio() {
		return medio;
	}
	public void setMedio(Medio medio) {
		this.medio = medio;
	}
	public ClasificacionGestacion getGestacion() {
		return gestacion;
	}
	public void setGestacion(ClasificacionGestacion gestacion) {
		this.gestacion = gestacion;
	}
	public Animal(String nombre, String id, String especie, int edad, ClasificacionComida comida,
			LocalDate fecha_nacimiento, float peso, Medio medio, ClasificacionGestacion gestacion) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.especie = especie;
		this.edad = edad;
		this.comida = comida;
		this.fecha_nacimiento = fecha_nacimiento;
		this.peso = peso;
		this.medio = medio;
		this.gestacion = gestacion;
	}
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", id=" + id + ", especie=" + especie + ", edad=" + edad + ", comida="
				+ comida + ", fecha_nacimiento=" + fecha_nacimiento + ", peso=" + peso + ", medio=" + medio
				+ ", gestacion=" + gestacion + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.nombre.compareTo(nombre));
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return id == other.id;
	}
	
	
}
