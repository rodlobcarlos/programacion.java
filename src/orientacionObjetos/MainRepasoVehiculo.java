package orientacionObjetos;

public class MainRepasoVehiculo {

	public static void main(String[] args) {
		RepasoVehiculo miVehiculo = new RepasoVehiculo();
		miVehiculo.peso = 100;
		miVehiculo.modelo = "Mustang";
		
		System.out.println("El coche pesa: " + miVehiculo.peso);
		System.out.println("La marca es: " + miVehiculo.modelo);
	}

}
