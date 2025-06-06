package gestiona_Historial;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import historial_navegacion_modelo.Historial;
import historial_navegacion_modelo.HistorialException;
import historial_navegacion_modelo.PaginaWeb;

public class Historial_Main {

	public static void main(String[] args) throws HistorialException {
		Historial_Main fn1 = new Historial_Main();
		int opcion = fn1.menu();
		PaginaWeb p = new PaginaWeb("urlPagNavegador", LocalDateTime.now());
		Historial h = new Historial();
		switch (opcion) {
		case 1: {
			p.agragarPaginaHistorial();
			break;
		} 
		case 2: {
			h.consultarHistorialCompleto();
			break;
		}
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}
		while(opcion != 6) {
			fn1.menu();
		}
	}

	int menu() {
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
		return opcion;
		
	}
	
	
}

