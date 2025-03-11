package modelo;

public class Peliculas extends ElementosMultimedia {
	private int minutos;

	public int getFases() {
		return minutos;
	}

	public void setFases(int minutos) {
		this.minutos = minutos;
	}

	@Override
	public String toString() {
		return "Peliculas [fases=" + minutos + "]";
	}

	public Peliculas(int id, String ubicacion, int minutos) {
		super(id, ubicacion);
		this.minutos = minutos;
	}

	@Override
	public boolean estaDiponible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getDevuelveDiasPrestamo() {
		// TODO Auto-generated method stub
		return 10;
	}
}
