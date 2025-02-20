package rodriguez_carlos;

public class Laptop extends Computadora{
	private double peso;

	public Laptop(String marca, String modelo, double precio, int capacidadRAM, double peso) {
		super(marca, modelo, precio, capacidadRAM);
		this.peso = peso;
	}

	protected double getPeso() {
		return peso;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}
	double descuento;
	double calcularPrecioDescuento(Dispositivo p) {
		if (peso > 2) {
			descuento = p.getPrecio() * 0.2;
		}else {
			descuento = p.getPrecio() * 0.12;
		}
		return descuento;
	}
}
