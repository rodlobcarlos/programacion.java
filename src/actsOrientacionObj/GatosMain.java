package actsOrientacionObj;

public class GatosMain {

	public static void main(String[] args) {
		Gatos gato1 = new Gatos("blanco", "callejero", "macho", 19, 4.5f);
		Gatos gato2 = new Gatos("marron", "callejero", "macho", 20, 4.9f);
		Gatos gato3 = new Gatos("gris", "callejero", "hembra", 10, 6.0f);
		
		gato1.maullar();
		gato1.comer("pienso");
		
		gato2.ronronea();
		gato2.comer("pesado");
		
		gato3.pelear(gato2);;
		gato1.pelear(gato2);
	}

}
