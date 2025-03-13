package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class introductoria_excepciones {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresa un número entero: ");
		
		try {
			int numero = scanner.nextInt();
			System.out.print("Detrás del input: ");
		}
		catch (InputMismatchException e) {
			
		}
		
		finally {
			System.out.println("Pase lo que pase salgo");
		}
		
		System.out.print("Entro en el catch");
		scanner.close();
	}
}
	