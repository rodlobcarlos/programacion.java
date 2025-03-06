package modelo;

public class Depredadores extends Animales{

	@Override
	boolean atacar(Animales a) {
		boolean ataca = false;
		if(a.equals(TipoAnimal.RAPAZ)) {
			System.out.println("Se alimenta de serpientes y reoderes");
			ataca = true;
		}else if (a.equals(TipoAnimal.SERPIENTE)) {
			System.out.println("Se alimente de ratas y conejos");
			ataca = true;
		}else if(a.equals(TipoAnimal.ROEDOR)) {
			System.out.println("Solo se alimenta de plantas");
			ataca = true;
		}else {
			System.out.println("El leon se alimenta de todos los animales");
			ataca = true;
		}
		return ataca;
	}

	@Override
	boolean huir(Animales a) {
		boolean huye = false;
		if(a.equals(TipoAnimal.SERPIENTE)) {
			System.out.println("No puede huir de ningún animal");
			huye = false;
		}else if(a.equals(TipoAnimal.ROEDOR)) {
			System.out.println("Huye de la serpiente, pero no de las rapaces");
		}else if(a.equals(TipoAnimal.RAPAZ)) {
			System.out.println("Huyen del leon");
			huye = true;
		}else {
			System.out.println("El leon no huye de ningún animal");
			huye = false;
		}
		return huye;
	}
	
	
}
