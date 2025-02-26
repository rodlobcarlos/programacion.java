package controlador;

import modelo.CorreoElectronico;

public class CorreoMain {

	public static void main(String[] args) {
		boolean continua = true;
		while(continua) {
			//pido correo
			int contadorCorreosValidos = 0;
			CorreoElectronico [] correos = new CorreoElectronico[5];
			if (CorreoElectronico.esCorreoValido("rodlocarlos@gmail.com")) {
				CorreoElectronico c = new CorreoElectronico(null, null);
				correos [contadorCorreosValidos] = c;
				contadorCorreosValidos = contadorCorreosValidos+1;
			}
			continua = (contadorCorreosValidos != 5)? true: false;
		}
	}

}
