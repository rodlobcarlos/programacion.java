package ejerciciosEntorno;

public class Ej_8 {

	public static void main(String[] args) {
		String palabra = null;
		
		if (palabra != null) {
			int longitud = palabra.length();
			System.out.println("Longitud de la palabra: " + longitud);
		} else {
			System.out.println("La palabra es nula, no se puede calcular su longitud.");
		}
	}
}
