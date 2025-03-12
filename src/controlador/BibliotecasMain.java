package controlador;

import modelo.ElementosMultimedia;
import modelo.Juego;
import modelo.Libro;
import modelo.Pelicula;

public class BibliotecasMain {

	public static void main(String[] args) {
		Libro lib1 = new Libro(1, "Sala 1", "Libro 1", "Editotial 1", "Genero 1");
		ElementosMultimedia elm1 = new Pelicula(2, "Sala 4", 140);
		ElementosMultimedia elm2 = new Juego(3, "Sala 2", 3);
		
		System.out.println(lib1.getDevuelveDiasPrestamo());
		System.out.println(elm1.estaDiponible());
		System.out.println(elm2.toString());
	}
}
