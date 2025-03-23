package simulacro_Deportes;

import java.time.LocalDate;

public class DeportistasMain {

	public static void main(String[] args) throws CompeticionException {
		Prueba prueba1 = new Prueba(1, "Sevilla", LocalDate.now().minusDays(5), EstadoPrueba.PLANIFICADA);
		Prueba prueba2 = new Prueba(1, "Albacete", LocalDate.now().minusDays(10), EstadoPrueba.CERRADA);
		
		Prueba [] prueba_compite = new Prueba[50];
		prueba_compite[0] = prueba1;
		
		Deportista corredor = new Corredor("Carlos", "España", 20, 68.5f, 1.80f);
		corredor.agragarPrueba(prueba1);
		corredor.agragarPrueba(prueba2);
		
		// POR TERMINAR 
		
		try { 
			prueba_compite[0] = prueba1;
			for(int i = 0; i < prueba_compite.length; i++) {
				if(prueba_compite != null && prueba_compite[i].equals(prueba_compite[i])) {
					throw new CompeticionException("Prueba ya agregada");
				}else {
					throw new CompeticionException("No puedes añadir una prueba con fecha pasada");
				}
			}
		}
		catch (CompeticionException e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
}
