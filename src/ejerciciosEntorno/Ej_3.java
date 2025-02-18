package ejerciciosEntorno;

import java.util.Random;
import java.util.Scanner;

public class Ej_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Elige una opción: ");
		int opcion = scanner.nextInt();

		Random apuesta_maquina = new Random();
		int value = apuesta_maquina.nextInt();
		System.out.println(apuesta_maquina.nextInt(2) + 1);

		if (opcion == value) {
			System.out.println("hola");
		}
		}
	}

	