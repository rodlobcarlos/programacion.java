package excepcion;

import java.util.Random;

public class Act4 {
	public static void main(String[] args) {

		Random random = new Random();

		int[] resultados = new int[20];

		try {
			for (int i = 0; i < 20; i++) {
				int num1 = random.nextInt(11);
				int num2 = random.nextInt(11);

				int division = num1 / num2;
			}

			resultados[100] = 1;

		} catch (ArithmeticException e) {
			System.out.println("Esta dividiendo por cero.");

		} catch (ArrayIndexOutOfBoundsException t) {
			System.out.println("Posición fuera del rango de la lista.");

		} catch (NullPointerException r) {
			System.out.println("Posición nula de la lista.");

		}
	}
}
