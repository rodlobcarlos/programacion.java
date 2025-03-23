package simulacro_Deportes;

import java.time.LocalDate;

public class Corredor extends Deportista {

	public Corredor(String nombre, String pais, int edad, float peso, float altura) {
		super(nombre, pais, edad, peso, altura);
	}

	@Override
	int getTiempoCalentamiento() {
		return 30 / 60;
	}

	@Override
	int getCaloriasNecesarias() {
		int calorias = 0;
		for(int i = 0; i == getPeso(); i++) {
			calorias = calorias + 50;
		}
		return calorias;
	}

	@Override
	public void competir() {
		System.out.println("El deportista compite corriendo");
		System.out.println("Su modalidad es correr");
	}

	@Override
	public int getTiempoPrueba() {
		
		return 10;
	}
	
}
