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
}
