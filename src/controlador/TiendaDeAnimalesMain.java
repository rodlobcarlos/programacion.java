package controlador;

import java.util.Arrays;

import modelo.Aves;
import modelo.Gato;
import modelo.Mascota;
import modelo.Perro;

public class TiendaDeAnimalesMain {

    public static void main(String[] args) {
    	int contadorAnimal = 0;
    	
    	Mascota perro = new Perro("Raza1", "No tiene pulgas");
    	perro.muestra(perro);
    	
    	Mascota gato = new Gato("Gris claro", "Tiene pelo largo");
    	gato.muestra(gato);
    	
    	TiendaDeAnimalesMain animal = new TiendaDeAnimalesMain();
    	System.out.println(perro.equals(perro));
    	
    	Gato gato1 = new Gato("Marron claro", "No tiene pelo largo");
    	gato.equals(gato1);
    	
    	 Mascota[] animales = new Mascota[10];
    	 animales[contadorAnimal] = gato;
    	 contadorAnimal +=1;
    	 
    	 System.out.println(Arrays.toString(animales));
    }

    void lista_animales(Mascota m, Mascota n, Mascota p, Mascota n_E, Aves n_A) {
    	
    }

    void mostrarDatos(Mascota animal) {
        System.out.println(animal.toString());
    }

    public class mascota {
        private int numMudadoPiel_al_año;
        private int mesesGestación;

        boolean eliminar_animal(Mascota n, Mascota r, Mascota p) {
            boolean eliminado = false;
            return eliminado;
        }

       /* boolean mayor_peso(Mascota p) {
            boolean mayor = false;
            if(p > p.getPeso()) {
            	mayor = true;
            }
            return mayor;
        }*/
    }
}