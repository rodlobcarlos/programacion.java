package ejerciciosEntorno;

import java.util.Scanner;

public class El_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		int num1 = scanner.nextInt();
		System.out.println("Ingrese otro número: ");
		int num2 = scanner.nextInt();
		int suma = sumarNumeros(num1, num2);
		System.out.println("La suma de los dos números es: " + suma);
		int multiplicacion = multiplicarNumeros(num1, num2);
		System.out.println("El producto de los dos números es: " + multiplicacion);
	}

	public static int sumarNumeros(int a, int b) {
		int suma = a + b;
		return suma;
	}

	public static int multiplicarNumeros(int x, int y) {
		int producto = 0;
		for (int i = 0; i < y; i++) {
			producto = sumarNumeros(producto, x);
		}
		return producto;
	}
}