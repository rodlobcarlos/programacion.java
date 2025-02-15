package boletin_4;

public class Camion_hrn extends Vehiculo_hrn{
	private int tonelaje;
	private int numPasajeros;
	private int numEjes;

	public Camion_hrn(String dueño, int numPuertas, int numRuedas, int tonelaje, int numPasajeros, int numEjes) {
		super(dueño, numPuertas, numRuedas);
		this.tonelaje = tonelaje;
		this.numPasajeros = numPasajeros;
		this.numEjes = numEjes;
	}

	@Override
	public String toString() {
		return "Camion_hrn [tonelaje=" + tonelaje + ", numPasajeros=" + numPasajeros + ", numEjes=" + numEjes + "]";
	}


	public int getTonelaje() {
		return tonelaje;
	}


	public void setTonelaje(int tonelaje) {
		this.tonelaje = tonelaje;
	}


	public int getNumPasajeros() {
		return numPasajeros;
	}


	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}


	public int getNumEjes() {
		return numEjes;
	}


	public void setNumEjes(int numEjes) {
		this.numEjes = numEjes;
	}
	
	boolean tieneLimitacion() {
		return true;
	}
	
	String getLicencias() {
		return;
	}
}
