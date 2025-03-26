package simulacro_Deportes;

import java.time.LocalDate;

public class Corredor extends Deportista {

	public Corredor(String nombre, String pais, int edad, float peso, float altura, Prueba[] pruebas_compite) {
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
		System.out.println("El deportista compite corriendo");
		System.out.println("Su modalidad es correr");
	}

	@Override
	public int getTiempoPrueba() {
		
		return 10;
	}
	
}
