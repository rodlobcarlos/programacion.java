package rodriguez_carlos;

public class Smartphone extends Telefono{
	private int cantidadCamaras;

	protected int getCantidadCamaras() {
		return cantidadCamaras;
	}

	protected void setCantidadCamaras(int cantidadCamaras) {
		this.cantidadCamaras = cantidadCamaras;
	}

	public Smartphone(String marca, String modelo, double precio, boolean tieneTecladoFisico, int cantidadCamaras) {
		super(marca, modelo, precio, tieneTecladoFisico);
		this.cantidadCamaras = cantidadCamaras;
	}
	
	double calcularPrecioDescuento(Dispositivo p) {
		double descuento = p.getPrecio() * 0.15;
		return descuento ;
	}
}	
