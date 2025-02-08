package boletin3;

public class Vehiculos {
	String marca;
	String modelo;
	int año_fabricacion;
	String tipo_combustible;
	float cantidad_combustible_tanque;
	float capacidad_tanque;
	

	@Override
	public String toString() {
		return "Vehiculos [marca=" + marca + ", modelo=" + modelo + ", año_fabricacion=" + año_fabricacion
				+ ", tipo_combustible=" + tipo_combustible + ", cantida_combustible_tanque="
				+ cantidad_combustible_tanque + ", capacidad_tanque=" + capacidad_tanque + "]";
	}

	public Vehiculos(String marca, String modelo, int año_fabricacion, String tipo_combustible,
			float cantida_combustible_tanque, float capacidad_tanque) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.año_fabricacion = año_fabricacion;
		this.tipo_combustible = tipo_combustible;
		this.cantidad_combustible_tanque = cantida_combustible_tanque;
		this.capacidad_tanque = capacidad_tanque;
	}

	float calcular_consumo_combustible(int kilometros) {
		float  consumo = kilometros / capacidad_tanque;
		return consumo;
	}

	boolean necesita_repostar(float cantidad_combustible_tanque) {
		boolean repostar = true;
		if(cantidad_combustible_tanque > ((capacidad_tanque * 0.2) / 100)) {
			System.out.println("Debe repostar");
		}else {
			System.out.println("No debe repostar");
		}
		return repostar;
	}
}