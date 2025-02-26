package modelo;

public class CorreoElectronico {
	private String nombre;
	private String dominio;
	
	public CorreoElectronico(String nombre, String dominio) {
		super();
		this.nombre = nombre;
		this.dominio = dominio;
	}

	@Override
	public String toString() {
		return "CorreoElectronico [nombre=" + nombre + ", dominio=" + dominio + "]";
	}

	public static boolean esCorreoValido(String correo) {
		boolean valido;
		if(correo.matches("\\[A-Za-z]+@[A-Za-z].[A-Za-z]")) {
			valido = true;
		}else {
			valido = false;
		}
		return valido;
	}
}
