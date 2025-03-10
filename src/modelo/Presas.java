package modelo;

public class Presas extends Animales{

	public Presas(String nombreEspecie, TipoAnimal tipo, String lugarDondeHabita, Animales[] animalesQueCome,
			Animales[] animalesComido) {
		super(nombreEspecie, tipo, lugarDondeHabita, animalesQueCome, animalesComido);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean atacar(Animales a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean huir(Animales a) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
