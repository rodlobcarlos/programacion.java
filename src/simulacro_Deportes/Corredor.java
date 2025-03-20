package simulacro_Deportes;

import java.time.LocalDate;

public class Corredor extends Deportista {

	@Override
	int getTiempoCalentamiento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int getCaloriasNecesarias() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int getHorasEntrenamiento(LocalDate fecha) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void agregarPrueba(Prueba[] prueba) {
		// TODO Auto-generated method stub
		
	}

	@Override
	Prueba getProximaPrueba() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	int contarPruebasPorEstado(EstadoPrueba estado) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void competir() {
		System.out.println("El deportista compite corriendo");
		System.out.println("Su modalidad es correr");
	}

	@Override
	public int getTiempoPrueba() {
		
		return 0;
	}
	
}
