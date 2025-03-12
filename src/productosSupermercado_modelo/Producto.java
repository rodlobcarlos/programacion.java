package productosSupermercado_modelo;

import java.time.LocalDate;
import java.util.Date;

// Clase Producto
public abstract class Producto {
	private int id;
	private String nombre;
	private String descripcion;
	private float peso;
	private float precio_venta;
	private float precio_compra;
	private float IVA;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(float precio_venta) {
		this.precio_venta = precio_venta;
	}

	public float getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(float precio_compra) {
		this.precio_compra = precio_compra;
	}

	public float getIVA() {
		return IVA;
	}

	public void setIVA(float iVA) {
		IVA = iVA;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", peso=" + peso
				+ ", precio_venta=" + precio_venta + ", precio_compra=" + precio_compra + ", IVA=" + IVA + "]";
	}

	public Producto(int id, String nombre, String descripcion, float peso, float precio_venta, float precio_compra,
			float iVA) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.peso = peso;
		this.precio_venta = precio_venta;
		this.precio_compra = precio_compra;
		IVA = iVA;
	}

	public abstract float calculaPrecioNeto();

	public abstract float calculaPrecioBruto();

	// Clase Liquido
	public interface Liquidos {
		public void setVolumen(double v);

		public double getVolumen();

		public void setTipoEnvase(String env);

		public String getTipoEnvase();

	}

	// Clase Alimentos
	public interface Alimentos {
		public void setCaducidad(Date fecha);

		public Date getCaducidad();

		public int getCalorias();
	}

	// Clase descuentos
	public interface Descuentos {
		public void setDecuento(double des);

		public double getDescuento();

		public double getPrecioDescuento();
	}

	// Clase Detergente
	public class Detergente extends Producto implements Liquidos, Descuentos {
		private String marca;
		private TipoDet tipo;
		private TipoRopa ropa;

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

		@Override
		public String toString() {
			return "Detergente [marca=" + marca + ", tipo=" + tipo + ", ropa=" + ropa + ", getIVA()=" + getIVA() + "]";
		}

		public Detergente(String marca, TipoDet tipo, TipoRopa ropa) {
			super(id, marca, marca, IVA, IVA, IVA, IVA);
			this.marca = marca;
			this.tipo = tipo;
			this.ropa = ropa;
		}
	}

	// Clase enum TipoDet
	public enum TipoDet {
		MAQUINA, MANO, COMBINADO
	}

	// Clase enum TipoRopa
	public enum TipoRopa {
		BLANCA, DE_COLOR
	}

	// Clase pescado
	public class Pescado extends Producto implements Alimentos {
		private String origen;
		private float peso;
		private LocalDate duracion;
		private String tipo;

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

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		@Override
		public void setCaducidad(Date fecha) {
			// TODO Auto-generated method stub

		}

		@Override
		public Date getCaducidad() {
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
		float calcularCalorias(String p) {
			if (p.equals("azul")) {
				calculo = peso * 3;
			} else if (p.equals("blanco")) {
				calculo = peso * 2;
			} else if(p.equals("marisco")) {
				calculo = peso * 1;
			}
			return calculo;
		}

		@Override
		public String toString() {
			return "Pescado [origen=" + origen + ", peso=" + peso + ", duracion=" + duracion + ", tipo=" + tipo
					+ ", calculo=" + calculo + ", getCalorias()=" + getCalorias() + ", getIVA()=" + getIVA() + "]";
		}

		public Pescado(String origen, float peso, LocalDate duracion, String tipo, float calculo) {
			super(id, tipo, tipo, calculo, calculo, calculo, calculo);
			this.origen = origen;
			this.peso = peso;
			this.duracion = duracion;
			this.tipo = tipo;
			this.calculo = calculo;
		}
	}

	// Clase Vino
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
		public void setCaducidad(Date fecha) {
			// TODO Auto-generated method stub

		}

		@Override
		public Date getCaducidad() {
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

		public Vino(String marca, TipoVino tipo, float gradoAlcohol, float precio) {
			super(id, marca, marca, precio, precio, precio, precio);
			this.marca = marca;
			this.tipo = tipo;
			this.gradoAlcohol = gradoAlcohol;
			this.precio = precio;
		}
	}

	// Clase enum TipoVino
	public enum TipoVino {
		BLANCO, TINTO, ROSADO
	}
}
