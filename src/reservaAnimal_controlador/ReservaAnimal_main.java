package reservaAnimal_controlador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import animales_modelo.Animal;
import animales_modelo.ClasificacionComida;
import animales_modelo.ClasificacionGestacion;
import animales_modelo.Medio;
import animales_modelo.ReservaAnimal;

public class ReservaAnimal_main {

	public static void main(String[] args) {
		
		List<Animal> animales = new ArrayList<Animal>(); 
		ReservaAnimal reserva = new ReservaAnimal("Reserva1", "España", 20000, animales);

		Collections.sort((List<Animal>) animales);

		
		Animal animal1 = new Animal("carmelo", "1", "camello", 8, ClasificacionComida.HERVIBOROS, LocalDate.now(), 6.3f, Medio.TIERRA, ClasificacionGestacion.OVIPAROS);
		Animal animal2 = new Animal("arquimedes", "2", "oveja", 13, ClasificacionComida.HERVIBOROS, LocalDate.of(2024, 6, 23), 6.3f, Medio.TIERRA, ClasificacionGestacion.OVIPAROS);

		animales.add(animal1);
		animales.add(animal2);

		reserva.agregarAnimal(animal1);
		reserva.agregarAnimal(animal2);

		reserva.mostrarInformacion(animal1);
		reserva.mostrarInformacion(animal2);

		
		animal1.compareTo(animal2);
		
	}

}
