package modelo;

public class Juegos extends ElementosMultimedia{
	private int fases;

	public Juegos(int id, String ubicacion, int fases) {
		super(id, ubicacion);
		this.fases = fases;
	}

	@Override
	public String toString() {
		return "Juegos [fases=" + fases + ", getId()=" + getId() + ", getUbicacion()=" + getUbicacion() + "]";
	}

	public int getFases() {
		return fases;
	}

	public void setFases(int fases) {
		this.fases = fases;
	}

	@Override
	public boolean estaDiponible() {
		return false;
	}

	@Override
	public int getDevuelveDiasPrestamo() {
		return 10;
	}
}
