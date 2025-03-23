package simlacro_Vehiculos_modelo;

import java.util.Date;

public class Patinete extends Vehiculo_general {

	public Patinete(int id, Alquiler[] alquileres, boolean disponible_alquilado) {
		super(id, alquileres, disponible_alquilado);
		// TODO Auto-generated constructor stub
	}
	
	private Date tiempo_autonomia;
	private String marca;
	private String modelo;
	private double cuantia_finanza;
	private boolean abonado;

	protected Date getTiempo_autonomia() {
		return tiempo_autonomia;
	}
	
	protected void setTiempo_autonomia(Date tiempo_autonomia) {
		this.tiempo_autonomia = tiempo_autonomia;
	}
	
	protected String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected double getCuantia_finanza() {
		return cuantia_finanza;
	}

	protected void setCuantia_finanza(double cuantia_finanza) {
		this.cuantia_finanza = cuantia_finanza;
	}

	protected boolean isAbonado() {
		return abonado;
	}

	protected void setAbonado(boolean abonado) {
		this.abonado = abonado;
	}

	public Patinete(int id, Alquiler[] alquileres, boolean disponible_alquilado, Date tiempo_autonomia,
			String marca, String modelo, double cuantia_finanza, boolean abonado) {
		super(id, alquileres, disponible_alquilado);
		this.tiempo_autonomia = tiempo_autonomia;
		this.marca = marca;
		this.modelo = modelo;
		this.cuantia_finanza = cuantia_finanza;
		this.abonado = abonado;
	}

	@Override
	public String toString() {
		return "Patinete [tiempo_autonomia=" + tiempo_autonomia + ", marca=" + marca + ", modelo=" + modelo
				+ ", cuantia_finanza=" + cuantia_finanza + ", abonado=" + abonado + "]";
	}
	
	boolean fianzaAbonada() {
		return true;
	}
}
