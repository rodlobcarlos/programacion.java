package torneo_tenis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestionaTorneo {

	public static void main(String[] args) throws TorneoException {

		
		Jugador j1 = new Jugador(1, "jugador1", "Rodríguez", "Español", 3, 2);
		Jugador j2 = new Jugador(2, "jugador2", "Jhonson", "Ingles", 3, 2);

		Partidos p = new Partidos(j1, j2, Estado.FINALIZADO, LocalDate.now());
		
		j1.agregarPartido(p);
		j2.agregarPartido(p);
		System.out.println(p.mostrarPartidos());
	}

}
 	