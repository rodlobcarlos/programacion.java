package registro_SinLuz;

import java.time.LocalDate;
import java.util.List;

public class GestionaEncuentros {

	public static void main(String[] args) {

		Repositorio_SinLuz registro = new Repositorio_SinLuz();

		// Crear los SinLuz
		SinLuz ardyn = new SinLuz("Ardyn");
		SinLuz selene = new SinLuz("Selene");
		SinLuz kael = new SinLuz("Kael");

		// Agregarlos al registro
		registro.agregarSinLuz(ardyn);
		registro.agregarSinLuz(selene);
		registro.agregarSinLuz(kael);

		// Crear los encuentros
		Encuentro e1 = new Encuentro("Asalto al Bastión Carmesí", LocalDate.of(2025, 3, 10), 8,
				List.of("Caballero Carmesí", "Tirano de Ceniza"));
		Encuentro e2 = new Encuentro("Emboscada en el Bosque Umbrío", LocalDate.of(2025, 3, 14), 5,
				List.of("Lobo Siniestro", "Bandido espectral"));
		Encuentro e3 = new Encuentro("Duelo en la Cripta Helada", LocalDate.of(2025, 3, 18), 7,
				List.of("Espectro del Hielo", "Mago congelado"));
		Encuentro e4 = new Encuentro("Resistencia en la Torre Abandonada", LocalDate.of(2025, 3, 20), 6,
				List.of("Arquero maldito", "Guardián de piedra"));
		Encuentro e5 = new Encuentro("Invasión en la Villa Marchita", LocalDate.of(2025, 3, 23), 9,
				List.of("Gigante marchito", "Portador del Plomo"));
		Encuentro e6 = new Encuentro("Caza en el Lago Sombrío", LocalDate.of(2025, 3, 25), 4,
				List.of("Serpiente negra", "Sombra anfibia"));
		Encuentro e7 = new Encuentro("Asalto final al Nexo del Caos", LocalDate.of(2025, 3, 30), 10,
				List.of("Señor del Caos", "Centinela oscuro", "Eco ardiente"));

		// Agregar encuentros a los SinLuz
		try {
			registro.agregarEncuentro(e1, 8);
			registro.agregarEncuentro(e3, 2);
			registro.agregarEncuentro(e2, 3);
			registro.agregarEncuentro(e4, 4);
			registro.agregarEncuentro(e6, 5);
			registro.agregarEncuentro(e5, 6);
			registro.agregarEncuentro(e7, 7);

			// Imprimir los SinLuz
			System.out.println("=== SinLuz y sus encuentros ===");
			System.out.println(ardyn);
			System.out.println(selene);
			System.out.println(kael);

			// Intentar agregar a un SinLuz que no existe
			System.out.println("\n=== Intentando agregar a SinLuz inexistente ===");
			registro.agregarEncuentro(e1, 4);
		} catch (EldenException ex) {
			System.out.println("Error: " + ex.getMessage());
		}

		// Intentar agregar un encuentro duplicado (debería actualizarse si es diferente)
		try {
			System.out.println("\n=== Antes de agregar encuentro duplicado ===");
			System.out.println(ardyn);

			// Crear un encuentro con mismo nombre pero diferente dificultad
			Encuentro e1mod = new Encuentro("Asalto al Bastión Carmesí", LocalDate.of(2025, 3, 10), 9,
					List.of("Caballero Carmesí", "Tirano de Ceniza"));

			registro.agregarEncuentro(e1mod, 1);

			System.out.println("\n=== Después de agregar encuentro duplicado (actualizado) ===");
			System.out.println(ardyn);
		} catch (EldenException ex) {
			System.out.println("Error: " + ex.getMessage());
		}

	}

}
