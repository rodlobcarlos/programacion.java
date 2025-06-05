package ordenaciones;

import java.util.Objects;

public class Animales{

	private int id;
	private String nombre;
	private String espcie;
	private int edad;
	private CalificacionComida calificacion;
	private String fecha_nacimiento;
	private float peso;
	private Medio medio;
	private clasificacionGestacion gestacion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspcie() {
		return espcie;
	}
	public void setEspcie(String espcie) {
		this.espcie = espcie;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public CalificacionComida getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(CalificacionComida calificacion) {
		this.calificacion = calificacion;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
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
	public clasificacionGestacion getGestacion() {
		return gestacion;
	}
	public void setGestacion(clasificacionGestacion gestacion) {
		this.gestacion = gestacion;
	}
	public Animales(int id, String nombre, String espcie, int edad, CalificacionComida calificacion,
			String fecha_nacimiento, float peso, Medio medio, clasificacionGestacion gestacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.espcie = espcie;
		this.edad = edad;
		this.calificacion = calificacion;
		this.fecha_nacimiento = fecha_nacimiento;
		this.peso = peso;
		this.medio = medio;
		this.gestacion = gestacion;
	}
	@Override
	public String toString() {
		return "Animales [id=" + id + ", nombre=" + nombre + ", espcie=" + espcie + ", edad=" + edad + ", calificacion="
				+ calificacion + ", fecha_nacimiento=" + fecha_nacimiento + ", peso=" + peso + ", medio=" + medio
				+ ", gestacion=" + gestacion + "]";
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
		Animales other = (Animales) obj;
		return id == other.id;
	}
	
	
}
