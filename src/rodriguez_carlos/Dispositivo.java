package rodriguez_carlos;

import java.util.Objects;

public class Dispositivo {
	private String marca;
	private String modelo;
	private double precio;
	
	protected String getMarca() {
		return marca;
	}
	protected void setMarca(String marca) {
		this.marca = marca;
	}
	protected String getModelo() {
		return modelo;
	}
	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}
	protected double getPrecio() {
		return precio;
	}
	protected void setPrecio(double precio) {
		if (this.precio < 0) {
			System.out.println("Error. El precio no debe ser negativo.");
			this.precio = 1;
		}else {
			this.precio = precio;
		}
	}
	
	@Override
	public String toString() {
		return "Dispositivo [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
				+ ", descuento=" + calcularPrecioDescuento() + "]";
	}
	public Dispositivo(String marca, String modelo, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		setPrecio(precio);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo, precio);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dispositivo other = (Dispositivo) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}
	double calcularPrecioDescuento() {
		double descuento = precio * 0.1;
		return descuento;
	}
}
