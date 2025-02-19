package actsOrientacionObj;

import java.time.LocalDate;

public class GestionaIncidenteEquipos {

	public static void main(String[] args) {
		Incidentes incid1 = new Incidentes(78, "Atropello", "Choque inesperado", LocalDate.of(2025, 03, 1), LocalDate.of(2025, 03, 30), Estado.CERRADA, Criticidad.GRAVE, null);
		Incidentes incid2 = new Incidentes(73, "Golpe", "En la cabeza", LocalDate.of(2025, 03, 1), LocalDate.of(2025, 03, 30), Estado.CERRADA, Criticidad.GRAVE, null);
		Incidentes incid3 = new Incidentes(80, "Tropiezo", "Tropiezo con un escalon", LocalDate.of(2025, 07, 15), LocalDate.of(2025, 07, 30), Estado.CERRADA, Criticidad.GRAVE, null);
		Incidentes incid4 = new Incidentes(50, "Atropello", "Choque inesperado", LocalDate.of(2025, 06, 13), LocalDate.of(2025, 07, 01), Estado.CERRADA, Criticidad.GRAVE, null);
		Incidentes incid5 = new Incidentes(34, "Tiro", "Tiro en la pierna derecha", LocalDate.of(2025, 02, 1), LocalDate.of(2025, 02, 12), Estado.CERRADA, Criticidad.GRAVE, null);
		Incidentes incid6 = new Incidentes(54, "Atropello", "Choque inesperado", LocalDate.of(2025, 01, 24), LocalDate.of(2025, 01, 30), Estado.CERRADA, Criticidad.GRAVE, null);
		
		Equipos eq1 = new Equipos("Equipo1", "Direccion1", "Windows", 0);
		Equipos eq2 = new Equipos("Equipo2", "Direccion2", "Linux", 2);
		Equipos eq3 = new Equipos("Equipo3", "Direccion3", "Linux", 1);
		Equipos eq4 = new Equipos("Equipo4", "Direccion4", "Windows", 1);
		
		Incidentes [] incidente = {incid1, incid2, incid3, incid4, incid5, incid6};
		System.out.println(incidente);

	}

}
