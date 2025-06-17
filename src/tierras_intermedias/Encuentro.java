package tierras_intermedias;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Encuentro {

	private String nombre;
	private LocalDate fecha_encuentro;
	private int dificultad;
	private List<Enemigos> listaEnemigos;
	
	public Encuentro(String nombre, LocalDate fecha_encuentro, int dificultad, List<Enemigos> listaEnemigos) {
		super();
		this.nombre = nombre;
		this.fecha_encuentro = fecha_encuentro;
		this.dificultad = dificultad;
		this.listaEnemigos = new ArrayList<Enemigos>();
	}

	@Override
	public String toString() {
		return "Encuentro [nombre=" + nombre + ", fecha_encuentro=" + fecha_encuentro + ", dificultad=" + dificultad
				+ ", listaEnemigos=" + listaEnemigos + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha_encuentro() {
		return fecha_encuentro;
	}

	public void setFecha_encuentro(LocalDate fecha_encuentro) {
		this.fecha_encuentro = fecha_encuentro;
	}

	public int getDificultad() {
		return dificultad;
	}

	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}

	public List<Enemigos> getListaEnemigos() {
		return listaEnemigos;
	}

	public void setListaEnemigos(List<Enemigos> listaEnemigos) {
		this.listaEnemigos = listaEnemigos;
	}
	
	
}
