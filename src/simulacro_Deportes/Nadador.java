package simulacro_Deportes;

import java.time.LocalDate;

public class Nadador extends Deportista {

	public Nadador(String nombre, String pais, int edad, float peso, float altura, Prueba[] pruebas_compite) {
		super(nombre, pais, edad, peso, altura);
	}

	@Override
	int getTiempoCalentamiento() {
		return 0;
	}

	@Override
	int getCaloriasNecesarias() {
		return 0;
	}

	@Override
	int getHorasEntrenamiento(LocalDate fecha) {
		return 0;
	}

	@Override
	void agregarPrueba(Prueba[] prueba) {
		
	}

	@Override
	Prueba getProximaPrueba() {
		return null;
	}

	@Override
	int contarPruebasPorEstado(EstadoPrueba estado) {
		return 0;
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
