package ejerciciosEntorno;

import java.util.Scanner;

public class Ej_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		int num = scanner.nextInt();
		int cuadrado = calcularCuadrado(num);
		System.out.println("El cuadrado del número es: " + cuadrado);
		int sumaCubos = calcularSumaCubos(num);
		System.out.println("La suma de los cubos hasta el número es: " + sumaCubos);
	}

	public static int calcularCuadrado(int x) {
		int cuadrado = x * x;
		return cuadrado;
	}

	public static int calcularSumaCubos(int n) {
		int suma = 0;
		for (int i = 1; i <= n; i++) {
			int cubo = calcularCubo(i);
			suma += cubo;
		}
		return suma;
	}

	public static int calcularCubo(int y) {
		int cubo = y * y * y;
		return cubo;
	}
}
