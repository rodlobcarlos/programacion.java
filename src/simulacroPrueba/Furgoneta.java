package simulacroPrueba;

public class Furgoneta extends Vehiculos_combustible{
	private int plazas;
	private int pma;

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public int getPma() {
		return pma;
	}

	public void setPma(int pma) {
		this.pma = pma;
	}

	public Furgoneta(int id, Alquiler[] alquileres, boolean disponible) {
		super(id, alquileres, disponible);
		// TODO Auto-generated constructor stub
	}

	@Override
	float getImporteTotalGenerado() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
