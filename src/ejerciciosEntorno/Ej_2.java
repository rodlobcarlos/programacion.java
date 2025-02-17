package ejerciciosEntorno;
import java.util.Scanner;

public class Ej_2 {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
		System.out.print("Introduce un número: ");
		numeros[i] = scanner.nextInt();
		}
		
		System.out.println("Números en orden inverso: ");
		for (int i = 9; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
		scanner.close();
	}

}
