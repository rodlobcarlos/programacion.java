package Repaso;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Ej_1 {

	public static void main(String[] args) {
		Ej_1 fn1 = new Ej_1();
		fn1.menu();
		Ej_1 fn2 = new Ej_1();
		fn2.dados(fn2.apuesta());

	}

	Scanner scanner = new Scanner(System.in);

	// Funcion menu()
	int menu() {
		System.out.println("======== MENU =========");
		System.out.println("1) Apostar.");
		System.out.println("2) Historial.");
		System.out.println("3) Retirarse.");
		System.out.println("=================");
		System.out.println("Elige una opción: ");
		int opcion = scanner.nextInt();

		switch (opcion) {
		case 1:
			apuesta();
			break;
		}
		return 0;
	}
	
	// Funcion apuesta()
	int[] apuesta() {
		int[] apuesta = new int[2];
		
		System.out.println("Escribe el número al que quieres apostar:");
		apuesta[0] = scanner.nextInt();
		System.out.println("Número apostado: " + apuesta[0]);
		
		System.out.println("Escribe la cantidad(€) que quieres apostar: ");
		apuesta[1] = scanner.nextInt();
		System.out.println("Cantidad apostada: " + apuesta[1]);
		
		return apuesta;
	}

	// Funcion dados(
	int dados(int[] apuesta) {
		String continuar = "si";
		while (continuar.equals("si")) {
			
			int num_apostado = apuesta[0];
			int cant_apostada = apuesta[1];

			Random aleatorio = new Random();
			int dado1 = aleatorio.nextInt(6) + 1;
			int dado2 = aleatorio.nextInt(6) + 1;
			int suma_dados = dado1 + dado2;
			System.out.println("La suma de los dados es: " + suma_dados);

			float gana = 0;
			float pierde = 0;
			float gana2 = 0;
			float pierde2 = 0;
			if (num_apostado == suma_dados) {
				gana = cant_apostada * 2;
				gana2 += cant_apostada;
				System.out.println("Has ganado: " + cant_apostada);
				System.out.println("Total: " + gana2);
				
			} else {
				pierde2 = gana2 - cant_apostada;
				System.out.println("Has perdido: " + cant_apostada);
				System.out.println("Total: " + pierde2);
			}
			
			System.out.println("¿Quieres seguir?: ");
			continuar = scanner.next();
			if (continuar.equals("si")) {
				int menu;
				menu = menu();
			}
		}
		System.out.println("Saliste del programa.");
		scanner.close();
		return 0;
	}
}