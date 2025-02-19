package boletin_5;

public class PlanetasMain {

	public static void main(String[] args) {
		Astros astro = new Astros(3.4, 7, 10000, 23, 10, "Astro");
		Planetas planeta = new Planetas(6.7, 6, 20000, 25, 13, "Tierra", 12350000, 500, true);
		Satelites satelite = new Satelites(3.5, 5, 1000, 45, 10, "Luna", 12343000, 400, planeta);
		
		astro.muestraInformacion(astro);
		System.out.println(astro.toString());
		
		planeta.muestraInformacion(planeta);
		System.out.println(planeta.toString());
		
		satelite.muestraInformacion(satelite);
		System.out.println(satelite.toString());
	}

}
