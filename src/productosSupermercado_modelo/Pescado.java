package productosSupermercado_modelo;

import java.time.LocalDate;

public class Pescado extends Producto implements Alimentos {
	private String origen;
	private float peso;
	private LocalDate duracion;
	private TipoPescado tipo;

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public LocalDate getDuracion() {
		return duracion;
	}

	public void setDuracion(LocalDate duracion) {
		this.duracion = duracion;
	}

	public TipoPescado getTipo() {
		return tipo;
	}

	public void setTipo(TipoPescado tipo) {
		this.tipo = tipo;
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
	public float calculaPrecioNeto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float calculaPrecioBruto() {
		// TODO Auto-generated method stub
		return 0;
	}

	float calculo;

	float calcularCalorias() {
		if (tipo.equals(TipoPescado.AZUL)) {
			calculo = peso * 3;
		} else if (tipo.equals(TipoPescado.BLANCO)) {
			calculo = peso * 2;
		} else if (tipo.equals(TipoPescado.MARISCO)) {
			calculo = peso * 1;
		}
		return calculo;
	}

	@Override
	public String toString() {
		return "Pescado [origen=" + origen + ", peso=" + peso + ", duracion=" + duracion + ", tipo=" + tipo
				+ ", calculo=" + calculo + ", getCalorias()=" + getCalorias() + ", getIVA()=" + getIVA() + "]";
	}

	public Pescado(int id, String nombre, String descripcion, float peso, float precio_venta, float precio_compra,
			float iVA, String origen, float peso2, LocalDate duracion, TipoPescado tipo, float calculo) {
		super(id, nombre, descripcion, peso, precio_venta, precio_compra, iVA);
		this.origen = origen;
		peso = peso2;
		this.duracion = duracion;
		this.tipo = tipo;
		this.calculo = calculo;
		iVA = precio_venta * 7 / 100;
	}

}
