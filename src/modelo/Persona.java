package modelo;

public class Persona {
	private static int contador;
	private int identificador; //auto_increment
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		super();
		this.identificador = contador+1;
		this.nombre = nombre;
		this.edad = edad;
		contador  = contador+1;
	}

	@Override
	public String toString() {
		return "Persona [identificador=" + identificador + ", nombre=" + nombre + ", edad="
				+ edad + "]";
	}
	
	static boolean validaSiDNIValido(String dni) {
		boolean valido;
		if(dni.matches("\\d{8}[a-zA-Z]{1}")) {
			valido = true;
		}else {
			valido = false;
		}
		return valido;
	}
	
	
}
