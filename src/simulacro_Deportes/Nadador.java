package simulacro_Deportes;

import java.util.Date;

public class Nadador extends Deportista{

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
	int getHorasEntrenamiento(Date fecha) {
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
}
