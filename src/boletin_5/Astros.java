package boletin_5;

import java.util.Objects;

public class Astros {
	private double radioEcuatorial;
	private int rotacionSobreEje;
	private int masa;
	private int tempMedia;
	private int gravedad;
	private String nombre;
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected double getRadioEcuatorial() {
		return radioEcuatorial;
	}
	protected void setRadioEcuatorial(double radioEcuatorial) {
		this.radioEcuatorial = radioEcuatorial;
	}
	protected int getRotacionSobreEje() {
		return rotacionSobreEje;
	}
	protected void setRotacionSobreEje(int rotacionSobreEje) {
		this.rotacionSobreEje = rotacionSobreEje;
	}
	protected int getMasa() {
		return masa;
	}
	protected void setMasa(int masa) {
		this.masa = masa;
	}
	protected int getTempMedia() {
		return tempMedia;
	}
	protected void setTempMedia(int tempMedia) {
		this.tempMedia = tempMedia;
	}
	protected int getGravedad() {
		return gravedad;
	}
	protected void setGravedad(int gravedad) {
		this.gravedad = gravedad;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(gravedad, masa, nombre, radioEcuatorial, rotacionSobreEje, tempMedia);
	}
	
	public Astros(double radioEcuatorial, int rotacionSobreEje, int masa, int tempMedia, int gravedad, String nombre) {
		super();
		this.radioEcuatorial = radioEcuatorial;
		this.rotacionSobreEje = rotacionSobreEje;
		this.masa = masa;
		this.tempMedia = tempMedia;
		this.gravedad = gravedad;
		this.nombre = nombre;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Astros astro = (Astros) obj;
		return gravedad == astro.gravedad && masa == astro.masa && Objects.equals(nombre, astro.nombre)
				&& Double.doubleToLongBits(radioEcuatorial) == Double.doubleToLongBits(astro.radioEcuatorial)
				&& rotacionSobreEje == astro.rotacionSobreEje && tempMedia == astro.tempMedia;
	}
	
	@Override
	public String toString() {
		return "Astros [radioEcuatorial=" + radioEcuatorial + ", masa=" + masa + ", nombre=" + nombre + "]";
	}
	
	void muestraInformacion(String objeto) {
		System.out.println("Nombre: " + nombre);
		System.out.println("Masa: " + masa);
		System.out.println("Diametro: " + radioEcuatorial);
		System.out.println("Nombre: " + nombre);
		System.out.println("Nombre: " + nombre);
		System.out.println("Nombre: " + nombre);
	}
}
