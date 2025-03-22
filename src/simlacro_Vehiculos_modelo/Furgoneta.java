package simlacro_Vehiculos_modelo;

import java.time.LocalDate;

public class Furgoneta extends Vehiculo_combustible implements Alquilable{

	public Furgoneta(int id, Alquiler[] alquileres, boolean disponible_alquilado) {
		super(id, alquileres, disponible_alquilado);
		// TODO Auto-generated constructor stub
	}
	
	private int plazas;
	private double pma;
	
	public int getPlazas() {
		return plazas;
	}
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	public double getPma() {
		return pma;
	}
	public void setPma(double pma) {
		this.pma = pma;
	}
	
	@Override
	public String toString() {
		return "Furgoneta [plazas=" + plazas + ", pma=" + pma + "]";
	}
	
	public Furgoneta(int id, Alquiler[] alquileres, boolean disponible_alquilado, int plazas, double pma) {
		super(id, alquileres, disponible_alquilado);
		this.plazas = plazas;
		this.pma = pma;
	}
	
	@Override
	public boolean estaAlquilado(LocalDate fecha) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public double getPrecioPorDia() {
		int precioBase = 45;
		return precioBase * 0.5 * pma;
	}
	
	
}
