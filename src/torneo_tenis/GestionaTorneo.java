package torneo_tenis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GestionaTorneo {

	public static void main(String[] args) throws TorneoException {

		Set<Jugador> jugadores = new TreeSet<Jugador>();
		
		Jugador j1 = new Jugador(1, "jugador1", "Rodríguez", "Español", 3, 2);
		Jugador j2 = new Jugador(2, "jugador2", "Jhonson", "Ingles", 3, 2);

		Partidos p = new Partidos(j1, j2, Estado.FINALIZADO, LocalDate.now());
		
		// AGREGAR JUGADOR
		Torneo t = new Torneo();
		System.out.println(t.agregarJugador(j2));
		System.out.println(t.agregarJugador(j1));
//		System.out.println(t.agregarJugador(j2)); EXCEPTION

		// REGISTRAR PARTIDO
		System.out.println(t.registrarPartido(p));
//		System.out.println(t.registrarPartido(p)); EXCEPTION

		//MUESTRA LISTA JUGADORES
		System.out.println(t.muestraListaJugadores());
		
		// MOSTRAR PARTIDOS
		t.mostrarPartidos(j1);
	}
}
 	