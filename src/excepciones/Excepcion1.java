package excepciones;

import java.io.IOException;

public class Excepcion1 {

	public static void main(String[] args) throws IOException { // Propaga la excepcion 
		try {
			throw new IOException(); // Se lanza una excepcion
		}
		catch(IOException e) {
			System.out.println("Ocurre una excepcion: " + e.getMessage());
		}
		System.out.println("Llego aquí");
	}

}
