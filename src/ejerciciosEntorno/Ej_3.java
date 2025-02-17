package ejerciciosEntorno;

import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class Ej_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Elige una opción: ");
		String opcion = scanner.next();

		Random apuesta_maquina = new Random();
		int value = apuesta_maquina.nextInt();
		System.out.println(apuesta_maquina.nextInt(2) + 1);

		switch (opcion) {
		case "piedra" | "papel" | "tijeras":
			if (opcion == "piedra" && apuesta_maquina == 0) {
				System.out.println("Empate.");
			} else if (opcion == " piedra" && apuesta_maquina == 2) {
				
			}
		}
	}
}