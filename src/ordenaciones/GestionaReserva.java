package ordenaciones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestionaReserva {

	public static void main(String[] args) {
		
		List<Animal> animales = new ArrayList<Animal>();

		Animal animal1 = new Animal("Dumbo", 1, "Elefante africano", 16, ClasificacionComida.HERVIBOROS,
				LocalDate.of(2007, 5, 15), 6000.5f, Medio.TIERRA, ClasificacionGestacion.VIVIPAROS);
		Animal animal2 = new Animal("Rojo", 2, "Tigre de Bengala", 8, ClasificacionComida.CARNIVOROS,
				LocalDate.of(2015, 8, 22), 220.3f, Medio.TIERRA, ClasificacionGestacion.VIVIPAROS);
		Animal animal3 = new Animal("Paco", 3, "Tucán toco", 4, ClasificacionComida.OMNIVOROS,
				LocalDate.of(2019, 3, 10), 0.8f, Medio.AIRE, ClasificacionGestacion.OVIPAROS);

		ReservaAnimal reserva = new ReservaAnimal("Reserva Natural ", "Huelva", 200000);
		reserva.agregarAnimal(animal1);
		reserva.agregarAnimal(animal2);
		reserva.agregarAnimal(animal3);
		
		Collections.sort(animales);

		System.out.println(reserva);
	}

}
