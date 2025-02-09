package simulacro_1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Ej_1 {

	public static void main(String[] args) {
		// Llamada a las funciones()
		Ej_1 fn2 = new Ej_1();
		fn2.dados(fn2.apostar());
		Ej_1 fn3 = new Ej_1();
		// fn3.historial();
	}
	// Funcion apostar()

	Scanner scanner = new Scanner(System.in); // Scanner()

	int[] apostar() {
		int[] apuesta = new int[2]; // Almaceno num_apostado y cant_apostada en una lista[]

		System.out.println("Escribe el número al que quieres apostar: ");
		apuesta[0] = scanner.nextInt(); // Almaceno num_apostado en apuesta[pos = 0]
		System.out.println("Número apostado: " + apuesta[0]);

		System.out.println("Escribe la cantidad(€) que quieres apostar: ");
		apuesta[1] = scanner.nextInt(); // Almaceno cant_apostada en apuesta[pos = 1]
		System.out.println("Cantidad apostada" + apuesta[1] + "€");
		return apuesta; // Retorna la lista apuesta[]
	}

	// Funcion dados()

	int dados(int[] apuesta) {
		float dinero = 0;
		float dinero1 = 0;
		float dinero2 = 0;
		String continuar = "si";
		while (continuar.equals("si")) { // Bucle que repite hasta que sea != "si"

			int num_apostado = apuesta[0]; // Llamo a la lista num_apostado
			float cant_apostada = apuesta[1]; // Llamo a la lista cant_apostada

			Random aleatorio = new Random(); // Llamo al random
			int dado1 = aleatorio.nextInt(6) + 1; // Número random del 1 al 6
			int dado2 = aleatorio.nextInt(6) + 1; // Número random del 1 al 6
			int suma_dados = dado1 + dado2;
			System.out.println("La suma de los dados es: " + suma_dados);

			if (suma_dados == num_apostado) {
				dinero = cant_apostada * 2; // Multiplico lo apostado por 2, SI ACIERTO
				dinero1 += cant_apostada;
				System.out.println("Has ganado " + cant_apostada + "€");
				System.out.println("Total: " + dinero1);
			} else {
				dinero2 = dinero1 - cant_apostada; // Resto el dinero ganado a la nueva cantidad apostada
				System.out.println("Has perdido " + cant_apostada + "€");
				System.out.println("Total: " + dinero2);
			}

			System.out.println("¿Quieres seguir apostando?: ");
			continuar = scanner.next();
			if (continuar.equals("si")) {
				apuesta = apostar(); // En el caso de "si", pinta dados()
			}
		}
		System.out.println("Saliste del programa."); // Sino, sale del programa
		System.out.println("Ganado " + dinero1 + "€" + "; Perdido " + dinero2 + "€");
		scanner.close();
		return 0;

	}

	// Funcion historial()

	/*
	 * String historial() { return "hola;
	 */
}