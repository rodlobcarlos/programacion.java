package controlador;

import modelo.Circulo;

public class CirculoMain {

	public static void main(String[] args) {
		Circulo cir = new Circulo(3);
		Circulo cir2 = new Circulo(30);
		System.out.println(cir.calculaArea());
		System.out.println(cir.toString());
		System.out.println(cir2.toString());
	}

}
