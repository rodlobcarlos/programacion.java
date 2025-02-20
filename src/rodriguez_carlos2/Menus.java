package rodriguez_carlos2;

import java.time.LocalDate;
import java.util.Objects;

public class Menus {
	private String identificador;
	private String nombre;
	private double consumo_calorico;
	private double precio_ventaMenu;
	private double precioCoste;
	private String tipoDieta;
	private boolean tieneFrutos;
	private LocalDate diaDeMenu;
	private int unidadesRepartidas;
	
	protected double getPrecio_ventaMenu() {
		return precio_ventaMenu;
	}
	protected void setPrecio_ventaMenu(double precio_ventaMenu) {
		if(this.precio_ventaMenu >= this.precioCoste) {
			this.precio_ventaMenu = precio_ventaMenu;
		}else if (this.precio_ventaMenu < this.precioCoste){
			System.out.println("El precio de venta no puede ser menor al precio de coste");
			this.precio_ventaMenu = precio_ventaMenu + 0.3;
		}else if (this.precio_ventaMenu < 0){
			System.out.println("El precio de venta no puede ser negativo");
			this.precio_ventaMenu = 0;
		}
	}
	protected String getIdentificador() {
		return identificador;
	}
	protected void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected double getConsumo_calorico() {
		return consumo_calorico;
	}
	protected void setConsumo_calorico(double consumo_calorico) {
		if (this.consumo_calorico < 1000) {
			System.out.println("La dieta es baja en calorías");
		}else {
			this.consumo_calorico = consumo_calorico;
		}
	}
	protected double getPrecioCoste() {
		return precioCoste;
	}
	protected void setPrecioCoste(double precioCoste) {
		this.precioCoste = precioCoste;
	}
	protected String getTipoDieta() {
		return tipoDieta;
	}
	protected void setTipoDieta(String tipoDieta) {
		this.tipoDieta = tipoDieta;
	}
	protected boolean isTieneFrutos() {
		return tieneFrutos;
	}
	protected void setTieneFrutos(boolean tieneFrutos) {
		this.tieneFrutos = tieneFrutos;
	}
	protected LocalDate getDiaDeMenu() {
		return diaDeMenu;
	}
	protected void setDiaDeMenu(LocalDate diaDeMenu) {
		this.diaDeMenu = diaDeMenu;
	}
	protected int getUnidadesRepartidas() {
		return unidadesRepartidas;
	}
	protected void setUnidadesRepartidas(int unidadesRepartidas) {
		this.unidadesRepartidas = unidadesRepartidas;
	}
	@Override
	public int hashCode() {
		return Objects.hash(consumo_calorico, diaDeMenu, identificador, nombre, precioCoste, precio_ventaMenu,
				tieneFrutos, tipoDieta, unidadesRepartidas);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menus other = (Menus) obj;
		return Double.doubleToLongBits(consumo_calorico) == Double.doubleToLongBits(other.consumo_calorico)
				&& Objects.equals(diaDeMenu, other.diaDeMenu) && Objects.equals(identificador, other.identificador)
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precioCoste) == Double.doubleToLongBits(other.precioCoste)
				&& Double.doubleToLongBits(precio_ventaMenu) == Double.doubleToLongBits(other.precio_ventaMenu)
				&& tieneFrutos == other.tieneFrutos && Objects.equals(tipoDieta, other.tipoDieta)
				&& unidadesRepartidas == other.unidadesRepartidas;
	}
	@Override
	public String toString() {
		return "Menus [nombre=" + nombre + ", precio_ventaMenu=" + precio_ventaMenu + ", tipoDieta=" + tipoDieta
				+ ", diaDeMenu=" + diaDeMenu + "]";
	}
	
	public Menus(String identificador, String nombre, double consumo_calorico, double precio_ventaMenu,
			double precioCoste, String tipoDieta, boolean tieneFrutos, LocalDate diaDeMenu, int unidadesRepartidas) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.consumo_calorico = consumo_calorico;
		this.precio_ventaMenu = precio_ventaMenu;
		this.precioCoste = precioCoste;
		this.tipoDieta = tipoDieta;
		this.tieneFrutos = tieneFrutos;
		this.diaDeMenu = diaDeMenu;
		this.unidadesRepartidas = unidadesRepartidas;
	}
	boolean contieneCarne(TipoDieta t) {
		boolean tieneCarne;
		if (t != TipoDieta.VEGETARIANO && t != TipoDieta.VEGANO) {
			tieneCarne = true;
		}else {
			tieneCarne = false;
		}
		return tieneCarne;
	}
}
