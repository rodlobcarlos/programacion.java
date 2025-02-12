package boletin_4;

public class VehiculoMain_hrn {

	public static void main(String[] args) {
		Automovil_hrn coche1 = new Automovil_hrn("Carlos", 4, 4, "C");
		Vehiculo_hrn coche2 = new Automovil_hrn ("Juan", 3, 4, "ECO");
		
		Vehiculo_hrn camion = new Vehiculo_hrn(null, 0, 0);
		
		boolean esVehiculo = coche2 instanceof Vehiculo_hrn;
		System.out.println("¿Es vehiculo?: " + esVehiculo);
		
		boolean esCoche = coche2 instanceof Automovil_hrn;
		System.out.println("¿Es coche?: " + esCoche);
		
		boolean esCamion = coche2 instanceof Automovil_hrn;
		System.out.println("¿Es camion?: " + esCamion);
		
		System.out.println("¿Es camion?: " + (coche2 instanceof Camion_hrn));
		
		
	}
}