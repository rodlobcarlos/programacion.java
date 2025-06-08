package torneo_tenis;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Jugador {

	private int id;
	private String nombre;
	private String apellido; 
	private String nacionalidad;
	private int ranking;
	private int num_partidos;
	private Set<Jugador> setjugador;
	
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public int getNum_partidos() {
		return num_partidos;
	}
	public void setNum_partidos(int num_partidos) {
		this.num_partidos = num_partidos;
	}
	public Set<Jugador> getSetjugador() {
		return setjugador;
	}
	public void setSetjugador(Set<Jugador> setjugador) {
		this.setjugador = setjugador;
	}
	
	public Jugador(int id, String nombre, String apellido, String nacionalidad, int ranking, int num_partidos,
			Set<Jugador> setjugador) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
		this.ranking = ranking;
		this.num_partidos = num_partidos;
		this.setjugador = new TreeSet<Jugador>();
	}
	
	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad
				+ ", ranking=" + ranking + ", num_partidos=" + num_partidos + ", setjugador=" + setjugador + "]";
	}
	
	public void agregarJugador(Jugador j) throws TorneoException {
		if(setjugador.contains(j)) {
			throw new TorneoException("Este jugador ya esta en la lista.");
			
		}else {
			setjugador.add(j);
			System.out.println(j + "jugador añadido.");
		}
	}
	
	public Set<Jugador> mostrarJugadores(){
		return setjugador;
		
	}
	
	public 
	
}
