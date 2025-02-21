package expresionesRegulares;

public class ValidaNum {

	public static void main(String[] args) {
		String num = new String("");
		String num2 = new String("12345678A");	
		String cart = new String("a");
		
		System.out.println(num.matches("[0-9]*"));
		System.out.println(num.matches("\\d*"));
		System.out.println(num.matches("[0-9]+"));
		System.out.println(num.matches("\\d+"));
		System.out.println(num2.matches("\\d{8}"));
		
		
		System.out.println(cart.matches("[a-zA-Z]{1}"));
		

		
	}

}
