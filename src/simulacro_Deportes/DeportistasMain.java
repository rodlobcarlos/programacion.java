package simulacro_Deportes;

import java.time.LocalDate;

public class DeportistasMain {

	public static void main(String[] args) {
		Prueba [] pruebas = new Prueba[50];
		
		Deportista d = new Corredor("Carlos", "Español", 20, 68, 180f, pruebas);
		Prueba p = new Prueba("Prueba1", "Sevilla", LocalDate.now(), EstadoPrueba.PLANIFICADA);
		
		pruebas[0] = p;
		d.setPruebas_compite(pruebas);
		System.out.println(d.getProximaPrueba());
		/*try {
			for(Prueba c : pruebas_compite) {
				if(c.equals(c)) {
					throw new CompeticionException("");
				}else if (c.equals(EstadoPrueba.PLANIFICADA)) {
				locaDate.now();
			}else if () {
			
		}
		catch (CompeticionException e) {
			System.out.println(e.getMessage());
		}*/
	}
}
