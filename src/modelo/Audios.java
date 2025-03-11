package modelo;

public class Audios extends ElementosMultimedia{
	private int minutos;

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	@Override
	public String toString() {
		return "Audios [minutos=" + minutos + "]";
	}

	public Audios(int id, String ubicacion, int minutos) {
		super(id, ubicacion);
		this.minutos = minutos;
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
