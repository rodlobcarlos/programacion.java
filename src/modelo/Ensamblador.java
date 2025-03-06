package modelo;

public class Ensamblador extends Robots{

	public Ensamblador(int iD, String modelo, int bateria, Estado estado, String combustible, String descripcion,
			int contador, String nombre) {
		super(iD, modelo, bateria, estado, combustible, descripcion, contador, nombre);
	}
	
	

	@Override
	public String toString() {
		return "Ensamblador [estado=" + estado + ", ejecutarTarea()=" + ejecutarTarea() + ", recargar()=" + recargar()
				+ ", getID()=" + getID() + "]";
	}



	@Override
	String ejecutarTarea() {
		return "Emsamblar pieza";
	}
	
	@Override
	public boolean recargar() {
		return false;
	}
	
	public boolean recargar(Robots c) {
		boolean recarga = false;
		if(estado == Estado.APAGADO && c.getCombustible().equals("gasolina")) {
			System.out.println("Recargando por gasolina");
			recarga = true;
		}else {
			System.out.println("Estoy encendido y no puede recargar");
			Estado encendido = Estado.ENCENDIDO;
			recarga = false;
		}
		return recarga;
	}
}
