package boletin_4;

public class CocheElectrico extends Vehiculo_hrn{
	private String tipoBateria;

	public String getTipoBateria(String LFP, String NCM) {
		return tipoBateria;
	}

	public void setTipoBateria(String tipoBateria) {
		this.tipoBateria = tipoBateria;
	}

	@Override
	public String toString() {
		return "CocheElectrico [tipoBateria=" + tipoBateria + ", getDueño()=" + getDueño() + "]";
	}

	public CocheElectrico(String dueño, int numPuertas, int numRuedas, String tipoBateria) {
		super(dueño, numPuertas, numRuedas);
		this.tipoBateria = tipoBateria;
	}
	
	
}
