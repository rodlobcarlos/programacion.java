package simlacro_Vehiculos_modelo;

import java.time.LocalDate;

public class Vehiculo_combustible extends Vehiculo_general {
	public Vehiculo_combustible(int id, Alquiler[] alquileres, boolean disponible_alquilado) {
		super(id, alquileres, disponible_alquilado);
		// TODO Auto-generated constructor stub
	}
	private String matricula;
	private boolean diesel;
	private String modelo;
	private String marca;

	protected String getMatricula() {
		return matricula;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	protected boolean isDiesel() {
		return diesel;
	}

	protected void setDiesel(boolean diesel) {
		this.diesel = diesel;
	}

	protected String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

}
