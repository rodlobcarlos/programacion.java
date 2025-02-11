package boletin_4;

public class Vehiculo_hrn {
	protected String dueño;
	protected int numPuertas;
	protected int numRuedas;
	
	
	public Vehiculo_hrn(String dueño, int numPuertas, int numRuedas) {
		super();
		this.dueño = dueño;
		this.numPuertas = numPuertas;
		this.numRuedas = numRuedas;
	}


	@Override
	public String toString() {
		return "Vehiculo_hrn [dueño=" + dueño + ", numPuertas=" + numPuertas + ", numRuedas=" + numRuedas + "]";
	}


	public String getDueño() {
		return dueño;
	}


	public void setDueño(String dueño) {
		this.dueño = dueño;
	}


	public int getNumPuertas() {
		return numPuertas;
	}


	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}


	public int getNumRuedas() {
		return numRuedas;
	}


	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	
}	
