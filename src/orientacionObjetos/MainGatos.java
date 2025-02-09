package orientacionObjetos;

public class MainGatos {

	public static void main(String[] args) {
		Gatos gato = new Gatos();
		Gatos gato2 = new Gatos();
		Gatos gato3 = new Gatos();

		
		gato.raza = "Albino";
		gato.color = "Blanco";
		gato.sexo = "Macho";
		gato.edad = 6;
		gato.peso = 7.2F;
		
		gato2.raza = "British Shorthair";
		gato2.color = "Gris";
		gato2.sexo = "Hembra";
		gato2.edad = 3;
		gato2.peso = 5.5F;
		
		gato3.raza = "Scottish Fold";
		gato3.color = "Gris";
		gato3.sexo = "Hembra";
		gato3.edad = 7;
		gato3.peso = 5.3F;
		
		gato.maulla();
		gato.come("pienso");
		
		gato2.ronronea();
		gato2.come("pescado");

		boolean gana = gato.fight();
		System.out.println(gato2.sexo + " contra " + gato3.sexo + " gana hembra: "  + gana);
		System.out.println(gato.sexo + " contra " + gato2.sexo + " gana hembra: " + gana);
	}
}
