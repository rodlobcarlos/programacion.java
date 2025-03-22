package simlacro_Vehiculos_modelo;

import java.time.LocalDate;

public interface Alquilable {
	boolean estaAlquilado(LocalDate fecha);
	double getPrecioPorDia();
}
