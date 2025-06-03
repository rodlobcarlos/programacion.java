package excepcion;

public class Act2 {

	public static void main(String[] args) {
		
		GestionaException m = new GestionaException();
		try {
			m.m1();
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}  
	
}
