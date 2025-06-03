package excepcion;

import java.util.Arrays;
import java.util.Random;

public class Act4 {

	public static void main(String[] args) {
		float[] divisiones = new float[20];
		Random numero = new Random();
		for (int i = 0; i < 20; i++) {
			try {
				double valor1 = numero.nextDouble();
				double valor2 = numero.nextDouble();

				if (valor2 == 0) {
					throw new ArithmeticException("No puedes dividir por cero");
				}
				if (i >= 20) {
					throw new ArrayIndexOutOfBoundsException("Guardando en más de 20");
				}
				divisiones[i] = (float) (valor1 / valor2);
			} catch (ArithmeticException e1) {
				System.out.println("Sale 0");
				throw e1;
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println(e2.getMessage());
				throw e2;
			} finally {
				try {
					System.out.println(Arrays.toString(divisiones));
				}
				catch (NullPointerException e3) {
					throw e3;
				}
			}
		}
	}

}
