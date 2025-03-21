package simulacro_Deportes;

import java.time.LocalDate;
import java.util.Arrays;

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
	
	@Override
	public String toString() {
		return "Deportista [nombre=" + nombre + ", pais=" + pais + ", edad=" + edad + ", peso=" + peso + ", altura="
				+ altura + ", pruebas_compite=" + Arrays.toString(pruebas_compite) + "]";
	}
	
	public Deportista(String nombre, String pais, int edad, float peso, float altura) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.pruebas_compite = new Prueba [50];
	}
	
	abstract int getTiempoCalentamiento();
	abstract int getCaloriasNecesarias();
	
	int getHorasEntrenamiento(LocalDate fecha) {
		int numEntrenamiento;
		
		return edad;
		
	}
	
	
	void agregarPrueba(Prueba [] prueba ) {
		
	}
	Prueba getProximaPrueba() {
		Prueba p = pruebas_compite[0];
		for(int i = 0; i < pruebas_compite.length; i++) {
			if(p != null && pruebas_compite[i] != null && pruebas_compite[i].equals(EstadoPrueba.PLANIFICADA)) {
				Prueba itero = pruebas_compite[i];
				int diasMinimo = itero.getFecha().compareTo(LocalDate.now());
				int diasItero = itero.getFecha().compareTo(LocalDate.now());
				if (diasMinimo > diasItero ) {
					p = itero;
				}
			}
		}
		return null;	
	}
	
	int contarPruebasPorEstado(EstadoPrueba estado) {
		return edad;
	}

}
