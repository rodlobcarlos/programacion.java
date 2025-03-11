package controlador;

import modelo.ElementosMultimedia;
import modelo.Juegos;
import modelo.Libros;
import modelo.Peliculas;

public class BibliotecasMain {

	public static void main(String[] args) {
		Libros lib1 = new Libros(1, "Sala 1", "Libro 1", "Editotial 1", "Genero 1");
		ElementosMultimedia elm1 = new Peliculas(2, "Sala 4", 140);
		ElementosMultimedia elm2 = new Juegos(3, "Sala 2", 3);
		
		System.out.println(lib1.getDevuelveDiasPrestamo());
		System.out.println(elm1.estaDiponible());
		System.out.println(elm2.toString());
	}
}
