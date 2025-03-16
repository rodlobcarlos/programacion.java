package productosSupermercado_modelo;

public class Detergente extends Producto implements Liquidos, Descuentos {
	private String marca;
	private TipoDet tipo;
	private TipoRopa ropa;
	private double descuento;

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public TipoDet getTipo() {
		return tipo;
	}

	public void setTipo(TipoDet tipo) {
		this.tipo = tipo;
	}

	public TipoRopa getRopa() {
		return ropa;
	}

	public void setRopa(TipoRopa ropa) {
		this.ropa = ropa;
	}

	@Override
	public void setDecuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public double getDescuento() {
		// TODO Auto-generated method stub
		return this.descuento;
	}

	@Override
	public double getPrecioDescuento() {
		// TODO Auto-generated method stub
		return this.getPrecio_venta() - this.descuento * this.getPrecio_venta();
	}

	@Override
	public void setVolumen(double v) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getVolumen() {
		// TODO Auto-generated method stub
		return this.getVolumen();
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

	@Override
	public String toString() {
		return "Detergente [marca=" + marca + ", tipo=" + tipo + ", ropa=" + ropa + ", getIVA()=" + getIVA() + "]";
	}

	public Detergente(int id, String nombre, String descripcion, float peso, float precio_venta, float precio_compra,
			float iVA, String marca, TipoDet tipo, TipoRopa ropa) {
		super(id, nombre, descripcion, peso, precio_venta, precio_compra, iVA);
		this.marca = marca;
		this.tipo = tipo;
		this.ropa = ropa;
		iVA = precio_venta * 21 / 100;
	}
}	
