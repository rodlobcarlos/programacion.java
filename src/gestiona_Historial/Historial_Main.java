package gestiona_Historial;

import java.util.Scanner;

public class Historial_Main {

	public static void main(String[] args) {
		Historial_Main fn1 = new Historial_Main();
		fn1.menu();
	}

	void menu() {
		System.out.println("1) Agregar página del historial");
		System.out.println("Consultar historial completo de todos los días");
		System.out.println("Consultar historial por día");
		System.out.println("Consultar registro del historial para una url");
		System.out.println("Borrar visitas a una página");
		
		Scanner scanner = new Scanner(System.in);
		
	}
}
