package simulacion_VehiculosTraficoRematri_modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Vehiculo implements Comparable<Vehiculo>{
	private String num_bastidor;
	private String num_matricula;
	private String marca;
	private String modelo;
	private LocalDate año_fabricacion;
	private String propietario_actual;
	
	public String getNum_bastidor() {
		return num_bastidor;
	}
	public void setNum_bastidor(String num_bastidor) {
		this.num_bastidor = num_bastidor;
	}
	public String getNum_matricula() {
		return num_matricula;
	}
	public void setNum_matricula(String num_matricula) {
		this.num_matricula = num_matricula;
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
	public LocalDate getAño_fabricacion() {
		return año_fabricacion;
	}
	public void setAño_fabricacion(LocalDate año_fabricacion) {
		this.año_fabricacion = año_fabricacion;
	}
	public String getPropietario_actual() {
		return propietario_actual;
	}
	public void setPropietario_actual(String propietario_actual) {
		this.propietario_actual = propietario_actual;
	}
	@Override
	public int hashCode() {
		return Objects.hash(num_bastidor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(num_bastidor, other.num_bastidor);
	}
	@Override
	public String toString() {
		return "Vehiculo [num_bastidor=" + num_bastidor + ", num_matricula=" + num_matricula + ", marca=" + marca
				+ ", modelo=" + modelo + ", año_fabricacion=" + año_fabricacion + ", propietario_actual="
				+ propietario_actual + "]";
	}
	public Vehiculo(String num_bastidor, String num_matricula, String marca, String modelo, LocalDate año_fabricacion,
			String propietario_actual) {
		super();
		this.num_bastidor = num_bastidor;
		this.num_matricula = num_matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.año_fabricacion = año_fabricacion;
		this.propietario_actual = propietario_actual;
	}
	
	@Override
	public int compareTo(Vehiculo o) {
		int comparable = this.num_bastidor.compareTo(o.getNum_bastidor());
		return comparable;
	}
}
