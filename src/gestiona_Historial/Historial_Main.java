package gestiona_Historial;

import java.util.Scanner;

public class Historial_Main {

	public static void main(String[] args) {
		Historial_Main fn1 = new Historial_Main();
		fn1.menu();
	}

	Scanner scanner = new Scanner(System.in);

	Historial_Main fn1 = new Historial_Main();


	/*
	 * int opcion = 0; while(opcion != 6) {
	 * 
	 * } } if(opcion == 6) { System.out.println("Saliste del programa"); } }
	 */
	void menu() {
		System.out.println("================ MENU =========================");
		System.out.println("1) Agregar página al historial");
		System.out.println("2) Consultar historial completo de todos los días");
		System.out.println("3) Consultar historial de un día");
		System.out.println("4) Consultar registros del historial para una url");
		System.out.println("5) Borrar visitas a una página");
		System.out.println("6) Salir");
		System.out.println("--------------------------------------------------");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime que opción quieres:");
		int opcion = scanner.nextInt();
	}
}
