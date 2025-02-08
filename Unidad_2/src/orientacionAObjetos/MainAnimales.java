package orientacionAObjetos;

import paquete2.Animal;

public class MainAnimales {

	public static void main(String[] args) {
		Animal perro = new Animal();
		perro.nombre = "hola";
		//perro.edad; // No funciona porque es private
		
		perro.tipo = "perro";
		boolean andar = perro.caminar();
		perro.comer();
		perro.darDeComer();
		
		boolean mismoTipo = perro.//esDelMimoTipo(gato);
	}
}