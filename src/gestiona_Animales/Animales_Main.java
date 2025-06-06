package gestiona_Animales;

import java.time.LocalDate;

import animales_modelo.Animal;
import animales_modelo.ClasificacionComida;
import animales_modelo.ClasificacionGestacion;
import animales_modelo.Medio;

public class Animales_Main {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal("Carmelo", 1, "leon", 20, ClasificacionComida.CARNIVOROS, LocalDate.now(), 5, Medio.TIERRA, ClasificacionGestacion.VIVIPAROS);
	}

}
