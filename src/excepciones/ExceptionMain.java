package excepciones;

public class ExceptionMain {

	public static void main(String[] args) throws CarlosException  {
		try {
			throw new CarlosException("Lanzando mis excepciones");
		}
		catch (CarlosException c) {
			System.out.println(c.getMessage());
			throw c;
		}
	}
	

}
