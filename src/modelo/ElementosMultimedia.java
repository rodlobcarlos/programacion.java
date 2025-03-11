package modelo;

public class ElementosMultimedia extends RecursosAPrestar implements IPrestable{

	public ElementosMultimedia(int id, String ubicacion) {
		super(id, ubicacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean estaDiponible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getDevuelveDiasPrestamo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
