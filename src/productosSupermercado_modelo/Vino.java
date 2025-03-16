package productosSupermercado_modelo;

import java.time.LocalDate;

public class Vino extends Producto implements Liquidos, Alimentos, Descuentos {
	private String marca;
	private TipoVino tipo;
	private float gradoAlcohol;
	private float precio;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public TipoVino getTipo() {
		return tipo;
	}

	public void setTipo(TipoVino tipo) {
		this.tipo = tipo;
	}

	public float getGradoAlcohol() {
		return gradoAlcohol;
	}

	public void setGradoAlcohol(float gradoAlcohol) {
		this.gradoAlcohol = gradoAlcohol;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public void setDecuento(double des) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPrecioDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCaducidad(LocalDate fecha) {
		// TODO Auto-generated method stub

	}

	@Override
	public LocalDate getCaducidad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCalorias() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setVolumen(double v) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getVolumen() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTipoEnvase(String env) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getTipoEnvase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float calculaPrecioNeto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float calculaPrecioBruto() {
		// TODO Auto-generated method stub
		return 0;
	}

	float calcularCalorias(Vino v) {
		float calculo = v.gradoAlcohol * 10;
		return calculo;
	}

	@Override
	public String toString() {
		return "Vino [marca=" + marca + ", tipo=" + tipo + ", gradoAlcohol=" + gradoAlcohol + ", precio=" + precio
				+ ", getCalorias()=" + getCalorias() + "]";
	}

	public Vino(int id, String nombre, String descripcion, float peso, float precio_venta, float precio_compra,
			float iVA, String marca, TipoVino tipo, float gradoAlcohol, float precio) {
		super(id, nombre, descripcion, peso, precio_venta, precio_compra, iVA);
		this.marca = marca;
		this.tipo = tipo;
		this.gradoAlcohol = gradoAlcohol;
		this.precio = precio;
	}
}
