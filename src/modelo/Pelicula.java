package modelo;

public class Pelicula extends ElementosMultimedia {
	private int minutos;

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	@Override
	public String toString() {
		return "Pelicula [minutos=" + minutos + ", getNombre()=" + getNombre() + ", getGenero()=" + getGenero() + "]";
	}

	public Pelicula(int id, String ubicacion, int minutos) {
		super(id, ubicacion);
		this.minutos = minutos;
	}

	@Override
	public boolean estaDiponible() {
		return false;
	}
	
	
}
