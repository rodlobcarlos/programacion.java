package simulacro_Vehiculos_controlador;

import java.time.LocalDate;
import java.util.Date;
import java.util.Arrays;

import simlacro_Vehiculos_modelo.Alquiler;
import simlacro_Vehiculos_modelo.Coche;
import simlacro_Vehiculos_modelo.EstadoAlquiler;
import simlacro_Vehiculos_modelo.Furgoneta;
import simlacro_Vehiculos_modelo.Patinete;
import simlacro_Vehiculos_modelo.Vehiculo_combustible;
import simlacro_Vehiculos_modelo.Vehiculo_general;

public class ConcesionarioMain {

	public static void main(String[] args) {
		Date fecha_entrega_inicio = new Date();

		Furgoneta furgoneta = new Furgoneta(1, null, true, 4, 10);
		Coche coche = new Coche(2, null, true);
		Patinete patinete = new Patinete(3, null, false, fecha_entrega_inicio, "ford", "mustang", 200, true);
		
		Alquiler a1 = new Alquiler(1, furgoneta, 2345, "1234324DNI", LocalDate.now(), LocalDate.of(2024, 3, 12), 10, EstadoAlquiler.REGISTRADO);
		Alquiler a2 = new Alquiler(2, coche, 245645, "12563464DNI", LocalDate.now(), LocalDate.of(2024, 6, 2), 7, EstadoAlquiler.CERRADO);
		Alquiler a3 = new Alquiler(3, coche, 35245, "242423345DNI", LocalDate.now(), LocalDate.of(2024, 10,23), 3, EstadoAlquiler.VIGENTE);

		Furgoneta[] alquileres = new Furgoneta[1];
		
		int cont_alquiler = 0;
		alquileres[cont_alquiler] = furgoneta;
		cont_alquiler += 1;
		System.out.println(Arrays.toString(alquileres));
	}

}
