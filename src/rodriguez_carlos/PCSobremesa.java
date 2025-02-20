package rodriguez_carlos;

public class PCSobremesa extends Computadora{
	private boolean tieneGPUdedicada;

	protected boolean isTieneGPUdedicada() {
		return tieneGPUdedicada;
	}

	protected void setTieneGPUdedicada(boolean tieneGPUdedicada) {
		this.tieneGPUdedicada = tieneGPUdedicada;
	}

	public PCSobremesa(String marca, String modelo, double precio, int capacidadRAM, boolean tieneGPUdedicada) {
		super(marca, modelo, precio, capacidadRAM);
		this.tieneGPUdedicada = tieneGPUdedicada;
	}
	
	
}
