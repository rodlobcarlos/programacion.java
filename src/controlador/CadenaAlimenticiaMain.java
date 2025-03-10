package controlador;

import modelo.Animales;
import modelo.Depredadores;
import modelo.Presas;
import modelo.TipoAnimal;

public class CadenaAlimenticiaMain {
	public static void main(String[] args) {
		
		Animales[] animalesQueCome = new Animales[10];
		Animales reptil = new Depredadores("Cobra", TipoAnimal.SERPIENTE, "Selva", animalesQueCome, animalesQueCome);
		Animales ave1 = new Depredadores("Águila real", TipoAnimal.RAPAZ, "Bosque", animalesQueCome, animalesQueCome);
		Animales ave2 = new Depredadores("Alcón", TipoAnimal.RAPAZ, "Bosque", animalesQueCome, animalesQueCome);
		Animales conejo = new Presas("Conejo", TipoAnimal.ROEDOR, "En casa", animalesQueCome, animalesQueCome);
		Animales felino = new Depredadores("León", TipoAnimal.LEON, "Sabana", animalesQueCome, animalesQueCome);
		
		int contador = 0;
		animalesQueCome[contador] = reptil;
		contador = + 1;
		animalesQueCome[contador] = ave1;
		contador = + 1;
		animalesQueCome[contador] = ave2;
		contador = + 1;
		animalesQueCome[contador] = conejo;
		contador = + 1;
		animalesQueCome[contador] = felino;
		contador = + 1;
		
		
	}
	
}
