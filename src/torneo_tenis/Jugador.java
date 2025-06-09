package torneo_tenis;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Jugador {

	private int id;
	private String nombre;
	private String apellido;
	private String nacionalidad;
	private int ranking;
	private int num_partidos;
	private List<Partidos> partidosJugados;

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

	public List<Partidos> getPartidosJugados() {
		return partidosJugados;
	}

	public void setPartidosJugados(List<Partidos> partidosJugados) {
		this.partidosJugados = partidosJugados;
	}

	public Jugador(int id, String nombre, String apellido, String nacionalidad, int ranking, int num_partidos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
		this.ranking = ranking;
		this.num_partidos = num_partidos;
		this.partidosJugados = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad
				+ ", ranking=" + ranking + ", num_partidos=" + num_partidos + ", setjugador=" + setjugador + "]";
	}

	public void agregarPartido(Partidos partido) {
		this.partidosJugados.add(partido);
	}

	public void registrarPartido(Partidos p) {
		partidosJugados.add(p);
		System.out.println("Partido: " + p + "añadido.");
	}
	
	public List<Partidos> mostrarPartidos() throws TorneoException {
		if(jugador1 == null || jugador2 == null) {
			throw new TorneoException("Este jugador no está en el torneo.");
		}
		return partidosJugados;
		
	}

}
