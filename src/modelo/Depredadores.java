package modelo;

public class Depredadores extends Animales{

	@Override
	boolean atacar(Animales a) {
		boolean ataca = false;
		if(a.equals(TipoAnimal.RAPAZ) && a.huir(TipoAnimal.SERPIENTE) && a.huir(TipoAnimal.ROEDOR)) {
			ataca = true;
		}
		return ataca;
	}

	@Override
	boolean huir(Animales a) {
		boolean huye = false;
		if(a.equals(TipoAnimal.SERPIENTE)) {
			huye = true;
		}
		return huye;
	}
	
	
}
