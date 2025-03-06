package modelo;

public class Pintor extends Robots{

	public Pintor(int iD, String modelo, int bateria, Estado estado, String combustible, String descripcion,
			int contador, String nombre) {
		super(iD, modelo, bateria, estado, combustible, descripcion, contador, nombre);
	}

	@Override
	public String toString() {
		return "Pintor [estado=" + estado + ", ejecutarTarea()=" + ejecutarTarea() + ", recargar()=" + recargar()
				+ ", getID()=" + getID() + "]";
	}

	@Override
	String ejecutarTarea() {
		return "Aplica pintura a los vehiculos de manera unirforme";
	}

	@Override
	public boolean recargar() {
		return false;
		
	}
}
