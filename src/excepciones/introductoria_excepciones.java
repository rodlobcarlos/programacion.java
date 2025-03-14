package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class introductoria_excepciones {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresa un número entero: ");
		int numero;

		try {
			numero = scanner.nextInt();
			String cadena = "";
			System.out.println(cadena.charAt(10));
		}
		catch (InputMismatchException e) {
			System.err.println("Entro en el catch1: " + e.getCause());
			System.out.println("Entro en el catch1: " + e.getMessage());
		}
		
		catch(StringIndexOutOfBoundsException carlos) {
			System.err.println("Entro en el catch2: " + carlos.getCause());
			System.out.println("Entro en el catch2: " + carlos.getMessage());
		}
		
		finally {
			System.out.println("Pase lo que pase salgo");
		}
		System.out.println("Sigo detrás de los finally");
		System.out.print("Ingresa un número entero: ");
		numero = scanner.nextInt();
		scanner.close();
	}
}