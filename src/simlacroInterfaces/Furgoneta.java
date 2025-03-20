package simlacroInterfaces;

public class Furgoneta extends VehiculoCombustible{
	private String plazas; 
	private float pma;

	public String getPlazas() {
		return plazas;
	}
	
	public void setPlazas(String plazas) {
		this.plazas = plazas;
	}

	public float getPma() {
		return pma;
	}

	public void setPma(float pma) {
		this.pma = pma;
	}

	@Override
	float getImporteTotalGenerado() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean estaAlquilado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public float getPrecioPorDia() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
