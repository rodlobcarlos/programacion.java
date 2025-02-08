package boletin_3;

public class Participante {
	private String nick;
	private String nombre;
	private int edad;
	private int puntuacion;
	
	public Participante(String nick, String nombre, int edad, int puntuacion) {
		super();
		this.nick = nick;
		this.nombre = nombre;
		this.edad = edad;
		this.puntuacion = puntuacion;
	}

	@Override
	public String toString() {
		return "Participantes [nick=" + nick + ", nombre=" + nombre + ", edad=" + edad + ", puntuacion=" + puntuacion
				+ "]";
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
}