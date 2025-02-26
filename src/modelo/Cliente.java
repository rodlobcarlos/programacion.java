package modelo;

public class Cliente {
	private String nombre;
	private String apellidos;
	private String DNI;
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + "]";
	}
	
	public Cliente(String nombre, String apellidos, String dNI) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		DNI = dNI;
	}
}
