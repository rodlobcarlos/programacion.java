package controlador;

import java.util.Arrays;

import modelo.Aves;
import modelo.Gato;
import modelo.Mascota;
import modelo.Perro;

public class TiendaDeAnimalesMain {

    public static void main(String[] args) {
    	Mascota perro = new Perro("Huscky", "No tiene pulgas");
    	perro.muestra(perro);
    	Mascota gato = new Gato("Gris claro", "Tiene pelo largo");
    	gato.muestra(gato);
    	TiendaDeAnimalesMain animal = new TiendaDeAnimalesMain();
    	Mascota[] Listamascotas = animal.mascotas;
    	System.out.println(Listamascotas);
    }

    private Mascota[] mascotas;

    @Override
    public String toString() {
        return "TiendaDeAnimales [mascotas=" + Arrays.toString(mascotas) + "]";
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