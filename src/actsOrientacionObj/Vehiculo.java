package actsOrientacionObj;

public class Vehiculo {
	String marca;
	String modelo;
	int añoFabricacion;
	String tipoCombustible;
	int capacidadTanque;
	int cantCombEnTanque;
	
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", añoFabricacion=" + añoFabricacion
				+ ", tipoCombustible=" + tipoCombustible + ", capacidadTanque=" + capacidadTanque
				+ ", cantCombEnTanque=" + cantCombEnTanque + "]";
	}

	public Vehiculo(String marca, String modelo, int añoFabricacion, String tipoCombustible, int capacidadTanque,
			int cantCombEnTanque) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.añoFabricacion = añoFabricacion;
		this.tipoCombustible = tipoCombustible;
		this.capacidadTanque = capacidadTanque;
		this.cantCombEnTanque = cantCombEnTanque;
	}
	
	int consumoMedio = 20;
	int calcularConsComb(int kilometros) {
		int consumoComb = kilometros % consumoMedio;
		System.out.println("Ha consumido: " + consumoComb + " litros de combustible");
		return consumoComb;
	}
	
	void necesitaRepostar() {
		if (cantCombEnTanque < (capacidadTanque * 0.2)) {
			System.out.println("Necesita repostar");
		}else {
			System.out.println("No necesita repostar");
		}
	}
}
