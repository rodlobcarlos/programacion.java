package repasoTiendaAnimales_modelo;

import java.time.LocalDate;

public class Gato extends Mascotas{
	private String color;
	private boolean pelo_largo;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPelo_largo() {
		return pelo_largo;
	}

	public void setPelo_largo(boolean pelo_largo) {
		this.pelo_largo = pelo_largo;
	}

	public Gato(String nombre, int edad, String estado, LocalDate fecha_nacimiento) {
		super(nombre, edad, estado, fecha_nacimiento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Gato [color=" + color + ", pelo_largo=" + pelo_largo + "]";
	}

	public Gato(String nombre, int edad, String estado, LocalDate fecha_nacimiento, String color, boolean pelo_largo) {
		super(nombre, edad, estado, fecha_nacimiento);
		this.color = color;
		this.pelo_largo = pelo_largo;
	}

	@Override
	boolean habla() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean morir() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	void cumpleaños(LocalDate cumpleaños) {
		// TODO Auto-generated method stub
	}

}
