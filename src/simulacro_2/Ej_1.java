package simulacro_2;

import java.util.Scanner;

public class Ej_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ej_1 fn1 = new Ej_1();
		fn1.menu();
	}
	Scanner scanner = new Scanner(System.in);
	// Funcion menu()
	
	int menu() {
		System.out.println("R) Registrar libros");
		System.out.println("%) Registrar libros");
		System.out.println("P) Registrar libros");
		System.out.println("V) Registrar libros");
		System.out.println("S) Registrar libros");
		System.out.println("Elige una opción: ");
		int opcion = scanner.nextInt();
		return 0;
	}
}
