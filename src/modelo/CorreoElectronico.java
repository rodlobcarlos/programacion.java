package modelo;

public class CorreoElectronico {
	private String nombre;
	private String dominio;
	
	public CorreoElectronico(String cadenaCompleta) {
		super();
		String [] division = cadenaCompleta.split("@");
		this.nombre = division [0];
		this.dominio = division [1];
	}

	@Override
	public String toString() {
		return "Correo electronico -> [nombre= " + nombre + ", dominio= " + dominio + "]";
	}

	public static boolean esCorreoValido(String correo) {
		boolean valido;
		if(correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$" )) {
			valido = true;
		}else {
			valido = false;
		}
		return valido;
	}
}
