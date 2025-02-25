package controlador;

import modelo.Conversor;
import modelo.ConversorInverso;

public class CambiosMain {

	public static void main(String[] args) {
		Conversor conv = new Conversor(100);
		conv.euros_a_dolares(conv);
		
		ConversorInverso conv2 = new ConversorInverso(100);
		conv2.dolares_a_euros(conv2);
		
	}

}
