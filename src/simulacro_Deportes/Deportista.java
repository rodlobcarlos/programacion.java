package simulacro_Deportes;

import java.util.Date;

public abstract class Deportista {
	private String nombre;
	private String pais;
	private int edad;
	private float peso;
	private float altura;
	private Prueba [] pruebas_compite;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public Prueba[] getPruebas_compite() {
		return pruebas_compite;
	}
	public void setPruebas_compite(Prueba[] pruebas_compite) {
		this.pruebas_compite = pruebas_compite;
	}
	abstract int getTiempoCalentamiento();
	abstract int getCaloriasNecesarias();
	abstract int getHorasEntrenamiento(Date fecha);
	abstract void agregarPrueba(Prueba [] prueba );
	abstract Prueba getProximaPrueba();
	abstract int contarPruebasPorEstado(EstadoPrueba estado);
}
