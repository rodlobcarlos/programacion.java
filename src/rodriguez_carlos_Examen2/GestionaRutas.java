package rodriguez_carlos_Examen2;

public class GestionaRutas {

	public static void main(String[] args) {
		Ciudad c1 = new Ciudad("Sevilla", 1000000);
		Ciudad c2 = new Ciudad("Madrid", 3000000);
		Ciudad c3 = new Ciudad("Barcelona", 5000000);
		Ciudad c4 = new Ciudad("Malaga", 5000000);
		Ciudad c5 = new Ciudad("Cadiz", 5000000);
		Ciudad c6 = new Ciudad("Córdoba", 5000000);
		
		Rutaterrestre ruta1 = new Rutaterrestre(1, "Sevilla", "Barcelona", 100);
		RutaAerea ruta2 = new RutaAerea(2, "Madrid", "Malaga", 200, TipoVuelo.LOW_COST, 0, null);
		RutaAerea ruta3 = new RutaAerea(3, "Madrid", "Sevilla", 50, TipoVuelo.NORMAL, 0, null);
		RutaAerea ruta4 = new RutaAerea(4, "Madrid", "Cadiz", 30, TipoVuelo.EXPRESS, 0, null);
		
		System.out.println(ruta1.getTipoRuta());
		System.out.println(ruta2.getTipoRuta());
		System.out.println(ruta3.getTipoRuta());
		System.out.println(ruta4.getTipoRuta());
		
		System.out.println(ruta1.getCoste());
		System.out.println(ruta2.getCoste());
		System.out.println(ruta3.getCoste());
		System.out.println(ruta4.getCoste());
		


		
	}

}
