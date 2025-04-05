package biblioteca_controlador;

import java.util.ArrayList;
import java.util.Scanner;

import biblioteca_modelo.Biblioteca;
import biblioteca_modelo.BibliotecaException;
import biblioteca_modelo.EstadoLibro;
import biblioteca_modelo.Libro;

public class Biblioteca_Main {

	public static void main(String[] args) {
		Biblioteca_Main f = new Biblioteca_Main();
		int opcion = f.menu();		
		
		Libro l1 = new Libro("Titulo1", "literario", "2025", EstadoLibro.PRESTADO);
		Libro l2 = new Libro("Titulo2", "poesia", "2024", EstadoLibro.LIBRE);
		
		ArrayList<String> libros = new ArrayList<String>();
		libros.add(null);
		
		
		Biblioteca biblio = new Biblioteca();
		
		while(opcion != 7) {
			f.menu();
			switch(opcion) {
			case 1:
				biblio.agregarLibro(l1);
				biblio.agregarLibro(l2);
				break;
			case 2:

			case 3:
				
			}
		}if(opcion == 7) {
			System.out.println("Saliste del programa");
		}
	}

	int menu() {
	
		System.out.println("=============== MENU ======================");
		System.out.println("1) Agregar un nuevo libro al inventario");
		System.out.println("2) Prestar un ejemplar de un libro");
		System.out.println("3) Devolver un ejemplar prestado");
		System.out.println("4) Mostrar la lista de todos los libros en el invetario");
		System.out.println("5) Mostrar información detallada de un libro: "
				+ "(titulo, autor, genero, año de publicacion, "
				+ "ejemplares disponibles y ejemplares prestados)");
		System.out.println("6) Buscar libros por título o autor");
		System.out.println("7) Salir del programa");
		System.out.println("----------------------------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Elige una opción: ");
		int opcion = scanner.nextInt();

		return opcion;
	}
}