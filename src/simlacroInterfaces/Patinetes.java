package simlacroInterfaces;

import java.time.LocalDate;

public class Patinetes extends Vehiculo{
	private LocalDate tiempo_autonomia;
	private String marca;
	private String modelo;
	private float cuantia_fianza;
	private boolean abonado_o_no;
	
	public LocalDate getTiempo_autonomia() {
		return tiempo_autonomia;
	}
	public void setTiempo_autonomia(LocalDate tiempo_autonomia) {
		this.tiempo_autonomia = tiempo_autonomia;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getCuantia_fianza() {
		return cuantia_fianza;
	}
	public void setCuantia_fianza(float cuantia_fianza) {
		this.cuantia_fianza = cuantia_fianza;
	}
	public boolean isAbonado_o_no() {
		return abonado_o_no;
	}
	public void setAbonado_o_no(boolean abonado_o_no) {
		this.abonado_o_no = abonado_o_no;
	}
	
	@Override
	float getImporteTotalGenerado() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean estaAlquilado() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public float getPrecioPorDia() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
