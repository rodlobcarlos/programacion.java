package boletin_4;

import java.time.LocalDate;

public class ProfesorMain {

	public static void main(String[] args) {
		ProfesorInterino interino = new ProfesorInterino("Carlos", "Inglés", LocalDate.now().plusMonths(6));
		Profesor interino2 = new ProfesorInterino("Juan", "Matematicas", LocalDate.now().plusMonths(4));
		
		System.out.println(interino.getFechaFinContrato());
		
		ProfesorInterino profesor3 = (ProfesorInterino)interino2;
		System.out.println(profesor3.getFechaFinContrato());
		
		ProfesorTitular titular = new ProfesorTitular("Antonio", "Filosofia", LocalDate.now().minusYears(1));
		System.out.println(titular.getFechaAdjudicacionPlaza());
		
		Profesor titular2 = new ProfesorTitular("Manuela", "Tecnología",  LocalDate.now().minusYears(1));
		ProfesorTitular profesor4 = (ProfesorTitular)titular2;
		System.out.println(profesor4.getFechaAdjudicacionPlaza());
		
		Profesor profesor31 = (Profesor)interino;
		System.out.println(profesor31.getSueldo());		
		
		ProfesorTitular titular1 = (ProfesorTitular)interino2;
	}

}
