package controlador;

import modelo.Conversor;
import modelo.ConversorInverso;

public class CambiosMain {

	public static void main(String[] args) {
		Conversor conv = new Conversor(100);
		System.out.println(conv.calcula_euros_a_dolares(conv));
		
		ConversorInverso conv2 = new ConversorInverso(100);
		System.out.println(conv2.calcula_dolares_a_euros(conv2));
		
	}

}
