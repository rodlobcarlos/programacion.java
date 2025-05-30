package excepcion;

public class MiExcepcion extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MiExcepcion(String mensaje){
		super(mensaje);
	}


	@Override
	public String toString() {
		return "MiExcepcion []";
	}

	public void metodo1(int numero) throws MiExcepcion {
		if(numero % 2 == 0) {
			System.out.println("Es par.");
		}else {
			throw new MiExcepcion("Este número es impar.");
		}
	}
	
}
