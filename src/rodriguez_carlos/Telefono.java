package rodriguez_carlos;

public class Telefono extends Dispositivo{
	private boolean tieneTecladoFisico;

	protected boolean getTieneTecladoFisico() {
		return tieneTecladoFisico;
	}

	protected void setTieneTecladoFisico(boolean tieneTecladoFisico) {
		this.tieneTecladoFisico = tieneTecladoFisico;
	}

	public Telefono(String marca, String modelo, double precio, boolean tieneTecladoFisico) {
		super(marca, modelo, precio);
		this.tieneTecladoFisico = tieneTecladoFisico;
	}
	
	
}
