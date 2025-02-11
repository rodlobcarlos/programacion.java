package ejerciciosEntorno;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej_1 {

	public static void main(String[] args) {
		Ej_1 fn = new Ej_1();
		fn.letras();
		Ej_1 fn2 = new Ej_1();
		fn2.numerDNI();
	}
	String[] letras() {
		String[] letras = {"t", "r", "w", "a", "g","m", "y", "f", "p", "d", "x", "b", "n", "j", "z",
				"s", "q", "v", "h", "l", "c", "k", "e"};
		return letras;
	}
	
	String numerDNI() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dame el número del DNI: ");
		String num = scanner.nextLine();
		
		if(num.length() != 8) {
			System.out.println("Error.");
		}else {
			int solucion = Integer.parseInt(num) % 23;
			System.out.println("La letra que te pertenece es: " + letras()[solucion]);

		}
		return num;
	}
} 