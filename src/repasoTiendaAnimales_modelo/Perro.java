package repasoTiendaAnimales_modelo;

import java.time.LocalDate;

public class Perro extends Mascotas{
	private String raza;
	private String pulgas;

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getPulgas() {
		return pulgas;
	}

	public void setPulgas(String pulgas) {
		this.pulgas = pulgas;
	}

	public Perro(String nombre, int edad, String estado, LocalDate fecha_nacimiento) {
		super(nombre, edad, estado, fecha_nacimiento);
		// TODO Auto-generated constructor stub
	}

	public Perro(String nombre, int edad, String estado, LocalDate fecha_nacimiento, String raza, String pulgas) {
		super(nombre, edad, estado, fecha_nacimiento);
		this.raza = raza;
		this.pulgas = pulgas;
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
