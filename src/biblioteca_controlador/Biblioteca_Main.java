package biblioteca_controlador;

import java.util.Scanner;

public class Biblioteca_Main {

	public static void main(String[] args) {
		Biblioteca_Main f = new Biblioteca_Main();
		f.menu();
		
		try {
			switch(menu()) {
			case 1:
				System.out.println("1) Agregar un nuevo libro al inventario");
			case 2:
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static int menu() {
		System.out.println("1) Agregar un nuevo libro al inventario");
		System.out.println("2) Prestar un ejemplar de un libro");
		System.out.println("3) Devolver un ejemplar prestado");
		System.out.println("4) Mostrar la lista de todos los libros en el invetario");
		System.out.println("5) Mostrar información detallada de un libro: "
				+ "(titulo, autor, genero, año de publicacion, ejemplares disponibles y ejemplares prestados)");
		System.out.println("6) Buscar libros por título o autor");
		System.out.println("7) Salir del programa");
		
		Scanner scanner = new Scanner(System.in);
		String opcion = "Elige una opción: ";
		
		System.out.println(opcion);
		return opcion;
	}
}