package excepcion;

import java.util.Random;

public class Act4 {

	public static void main(String[] args) {
		
		int table []  = new able [10]; ;
		int num = 0;
		int num1 = 0;
		try {
			for (int i = 0; i <= 20; i++) {
				Random random = new Random();
				int numero1 = random.nextInt(11);
				int numero2 = random.nextInt(11);
				
				int division = numero1 / numero2;
				listaNumeros.add(division);
				
			} if(listaNumeros.size()> 99) {
				throw new ArrayIndexOutOfBoundsException("La longitud es mayor a la permitida");
				
			} if(num == 0 || num1 == 0) {
				throw new ArrayIndexOutOfBoundsException("Estás dividiendo por cero.");
				
			} for(Integer division : listaNumeros) {
				if(division == null) {
					throw new NullPointerException();
				}
				
			} 
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			
		} catch (ArithmeticException a) {
			System.out.println(a.getMessage());
			
		}catch (NullPointerException r) {
			System.out.println(r.getMessage());
		}
		
	}

}
