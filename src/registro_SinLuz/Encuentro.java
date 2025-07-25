package registro_SinLuz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Encuentro {

	
	private String nombre;
	private LocalDate fecha_encuentro;
	private int dificultad;
	private List<String> enemigos;

	public Encuentro(String nombre, LocalDate fecha_encuentro, int dificultad, List<String> enemigos) {
		super();
		this.nombre = nombre;
		this.fecha_encuentro = fecha_encuentro;
		this.dificultad = dificultad;
		this.enemigos = enemigos;
	}

	@Override
	public String toString() {
		return "Encuentro [nombre=" + nombre + ", fecha_encuentro=" + fecha_encuentro + ", dificultad=" + dificultad
				+ ", enemigos=" + enemigos + "]";
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

	public List<String> getEnemigos() {
		return enemigos;
	}

	public void setEnemigos(List<String> enemigos) {
		this.enemigos = enemigos;
	}
	
	
}
