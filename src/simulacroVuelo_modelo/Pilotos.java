package simulacroVuelo_modelo;

import java.util.Objects;

public abstract class Pilotos implements IVuelo{
	private String nombre;
	private String nacionalidad;
	private int edad;
	private int num_licencia;
	private int total_horas_vuelo;
	private String vuelos_asignados;
	protected Vuelo [] lista_vuelos;
 	 
	public String getVuelos_asignados() {
		return vuelos_asignados;
	}
	public void setVuelos_asignados(String vuelos_asignados) {
		this.vuelos_asignados = vuelos_asignados;
	}
	public Vuelo[] getLista_vuelos() {
		return lista_vuelos;
	}
	public void setLista_vuelos(Vuelo[] lista_vuelos) {
		this.lista_vuelos = lista_vuelos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getNum_licencia() {
		return num_licencia;
	}
	public void setNum_licencia(int num_licencia) {
		this.num_licencia = num_licencia;
	}
	public int getTotal_horas_vuelo() {
		return total_horas_vuelo;
	}
	public void setTotal_horas_vuelo(int total_horas_vuelo) {
		this.total_horas_vuelo = total_horas_vuelo;
	}
	
	
	public Pilotos(String nombre, String nacionalidad, int edad, int num_licencia, int total_horas_vuelo,
			String vuelos_asignados, Vuelo[] lista_vuelos) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.num_licencia = num_licencia;
		this.total_horas_vuelo = total_horas_vuelo;
		this.vuelos_asignados = vuelos_asignados;
		this.lista_vuelos = new Vuelo[30];
	}
	@Override
	public int hashCode() {
		return Objects.hash(num_licencia);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pilotos other = (Pilotos) obj;
		return num_licencia == other.num_licencia;
	} 
	
	abstract int contarVuelos();
	abstract void agregarVuelo();
}
