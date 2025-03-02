package controlador;

import java.util.Scanner;

import modelo.CorreoElectronico;

public class GestionaCorreo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean continua = true;
		int contadorValidos = 0;
		CorreoElectronico[] correos = new CorreoElectronico[5]; // Lista de 5 objetos

		while (continua) { // EL bucle sigue hasta que se complete la lista
			System.out.println("Escribe un correo electrónico: ");
			String correo = scanner.next(); // Pide correo

			if (CorreoElectronico.esCorreoValido(correo)) { // Si el correo es valido
				CorreoElectronico corrEl = new CorreoElectronico(correo); // Se crea objeto por cada correo valido
				correos[contadorValidos] = corrEl; // el objeto se almacena en la lista correos
				contadorValidos++; // El contador se actualiza por cada correo valido, hasta 5
				System.out.println("Se ha creado un objeto nuevo");
			}else {
				System.out.println("No se ha creado un objeto nuevo");
			}
			
			if (contadorValidos == 5) { // Cuando el contador de correosValidos llegue a 5, el bucle termina
				continua = false;
			}				
		}
		for (CorreoElectronico correo : correos) { // Recorre la lista de correos validos
			System.out.println(correo); // Los imprime
		}
	}

}
