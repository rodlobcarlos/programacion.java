package simulacro_Deportes;

import java.time.LocalDate;

public class Nadador extends Deportista {

	public Nadador(String nombre, String pais, int edad, float peso, float altura, Prueba[] pruebas_compite) {
		super(nombre, pais, edad, peso, altura);
	}

	@Override
	int getTiempoCalentamiento() {
		return 2;
	}

	@Override
	int getCaloriasNecesarias() {
		int calorias = 0;
		for(int i = 0; i == getPeso(); i++) {
			calorias = calorias + 100;
		}
		return calorias;
	}

	@Override
	public void competir() {
		System.out.println("El deportista compite nadando");
		System.out.println("Su modalidad es nada");
	}

	@Override
	public int getTiempoPrueba() {
		return 2;
	}
}
