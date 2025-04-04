package biblioteca_controlador;

import java.util.Scanner;

import biblioteca_modelo.Biblioteca;
import biblioteca_modelo.EstadoLibro;
import biblioteca_modelo.Libro;

public class Biblioteca_Main {

	public static void main(String[] args) {
		Biblioteca_Main f = new Biblioteca_Main();
		int opcion = f.menu();		
		
		Libro l1 = new Libro("Titulo1", "literario", "2025", EstadoLibro.PRESTADO);
		
		try {
			switch(opcion) {
			case 1:
				Biblioteca lb;
				lb.agregarLibro(l1);
			case 2:
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	int menu() {
	
		System.out.println("1) Agregar un nuevo libro al inventario");
		System.out.println("2) Prestar un ejemplar de un libro");
		System.out.println("3) Devolver un ejemplar prestado");
		System.out.println("4) Mostrar la lista de todos los libros en el invetario");
		System.out.println("5) Mostrar información detallada de un libro: "
				+ "(titulo, autor, genero, año de publicacion, ejemplares disponibles y ejemplares prestados)");
		System.out.println("6) Buscar libros por título o autor");
		System.out.println("7) Salir del programa");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Elige una opción: ");
		int opcion = scanner.nextInt();

		return opcion;
	}
}