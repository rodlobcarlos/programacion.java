package excepciones;

import java.io.File;
import java.io.IOException;

public class Act1 {

	public static void main(String[] args) {
        //Declaro objeto fichero
        File fichero = new File("salida.txt");
        //Lo creo si no existe
        try {
			boolean creado = fichero.getAbsoluteFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
