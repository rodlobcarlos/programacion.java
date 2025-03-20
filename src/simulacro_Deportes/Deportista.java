package simulacro_Deportes;

import java.time.LocalDate;

public abstract class Deportista implements ICompeticion{
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
	
	int calculaDia;
	int getHorasEntrenamiento(LocalDate fecha) {
		for(Prueba a : pruebas_compite) {
//			calculaDia; 
		}
		return edad;
		
	}
	void agregarPrueba(Prueba [] prueba ) {
		
	}
	Prueba getProximaPrueba() {
		return null;
		
	}
	int contarPruebasPorEstado(EstadoPrueba estado) {
		return edad;
	}

}
