package boletin_3;

import java.time.LocalDate;

public class RegistroDiario {
	private String lugarRecogidaDatos;
	private LocalDate fecha;
	private int datosRecogidos;
	
	public String getLugarRecogidaDatos() {
		return lugarRecogidaDatos;
	}
	public void setLugarRecogidaDatos(String lugarRecogidaDatos) {
		this.lugarRecogidaDatos = lugarRecogidaDatos;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public int getDatosRecogidos() {
		return datosRecogidos;
	}
	public void setDatosRecogidos(int datosRecogidos) {
		this.datosRecogidos = datosRecogidos;
	}
	
	public RegistroDiario(String lugarRecogidaDatos, LocalDate fecha, int datosRecogidos) {
		super();
		this.lugarRecogidaDatos = lugarRecogidaDatos;
		this.fecha = fecha;
		this.datosRecogidos = datosRecogidos;
	}
	
	@Override
	public String toString() {
		return "RegistroDiario [lugarRecogidaDatos=" + lugarRecogidaDatos + ", fecha=" + fecha + ", datosRecogidos="
				+ datosRecogidos + "]";
	}
	
	/*float tempMediaSemana() {
		return ;
	}*/   
}