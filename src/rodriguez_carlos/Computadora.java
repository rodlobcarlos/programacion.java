package rodriguez_carlos;

public class Computadora extends Dispositivo{
	private int capacidadRAM;

	protected int getCapacidadRAM() {
		return capacidadRAM;
	}

	protected void setCapacidadRAM(int capacidadRAM) {
		this.capacidadRAM = capacidadRAM;
	}

	public Computadora(String marca, String modelo, double precio, int capacidadRAM) {
		super(marca, modelo, precio);
		this.capacidadRAM = capacidadRAM;
	}
	
	
}
