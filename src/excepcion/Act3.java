package excepcion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Act3 {

	public static void main(String[] args) {

		List<Integer> listaNumero = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Dame un número: ");
		int numero = scanner.nextInt();
		
		listaNumero.add(numero);
		System.out.println("Dame un número: ");
		int numero1 = scanner.nextInt();

		listaNumero.add(numero1);

		
		for (int num : listaNumero) {
			if(num > 0) {
				throw new ArithmeticException("Hay un número positivo");

			}
		}
		System.out.println(listaNumero);
	}

}
