package miniSimulacion;

public class FutureCarsMain {

	public static void main(String[] args) {
		Conductores conductor1 = new Conductores("Carlos", 1);
		conductor1.conducir();
		
		Coches coche1 = new Coches("ford", "mustang", "1234-asd", conductor1, EstadoCoche.arrancado);
		Coches coche2 = new Coches("ford", "mustang", "1233-asd", conductor1, EstadoCoche.arrancado);
		coche1.cocheIgual(coche2);
		coche1.debeParar(EstadoCoche.arrancado);
	}

}
