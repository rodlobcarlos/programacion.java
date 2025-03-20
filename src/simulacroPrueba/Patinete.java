package simulacroPrueba;

import java.time.LocalDate;

public class Patinete extends VehiculoGeneral implements IAalquilable{
	private int id;
	private LocalDate tiempo_autonomia;
	private String marca;
	private String modelo;
	private int fianza;
	private boolean abonada;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public int getFianza() {
		return fianza;
	}
	public void setFianza(int fianza) {
		this.fianza = fianza;
	}
	public boolean isAbonada() {
		return abonada;
	}
	public void setAbonada(boolean abonada) {
		this.abonada = abonada;
	}
	
	public Patinete(int id, Alquiler[] alquileres, boolean disponible, int id2, LocalDate tiempo_autonomia,
			String marca, String modelo, int fianza, boolean abonada) {
		super(id, alquileres, disponible);
		id = id2;
		this.tiempo_autonomia = tiempo_autonomia;
		this.marca = marca;
		this.modelo = modelo;
		this.fianza = fianza;
		this.abonada = abonada;
	}

	boolean FianzaAbonada() {
		return abonada;
	}
	
	@Override
	float getImporteTotalGenerado() {
		// TODO Auto-generated method stub
		return 0;
	}
}
