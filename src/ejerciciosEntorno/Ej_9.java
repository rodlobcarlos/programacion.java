package ejerciciosEntorno;

import java.util.Scanner;

public class Ej_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Programa de suma de dos números.");
		System.out.print("Ingresa el primer número: ");
		int num1 = scanner.nextInt();
		System.out.print("Ingresa el segundo número: ");
		int num2 = scanner.nextInt();
		int resultado = sumarNumeros(num1, num2);
		System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado);
		scanner.close();
	}

	public static int sumarNumeros(int a, int b) {
		int suma = a + b;
		return suma;
	}
}
