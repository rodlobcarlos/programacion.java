package actsOrientacionObj;

public class VehiculosMain {

	public static void main(String[] args) {
		Vehiculo coche1 = new Vehiculo("ford", "mustang", 2020, "diesel", 150, 20);
		Vehiculo coche2 = new Vehiculo("seat", "leon", 2018, "gasolina", 50, 12);
		
		coche1.calcularConsComb(30);
		coche2.necesitaRepostar();
	}

}
