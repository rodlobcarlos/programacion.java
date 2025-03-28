package listas;

public class Provincia_Main {

	public static void main(String[] args) throws ExecpcionProvincia {
		ListaProvincia provincias = new ListaProvincia();
		Provincia p = new Provincia("Sevilla", 2134235235);
		
		try {
			System.out.println(provincias.addSinRepetidos(p));
			System.out.println(provincias.addSinRepetidos(p));
		}
		catch (ExecpcionProvincia ep) {
			System.out.println(ep.getMessage());
			throw ep;
		}
	}

}
