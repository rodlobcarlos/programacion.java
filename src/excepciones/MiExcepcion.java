package excepciones;

import java.util.Arrays;

public class MiExcepcion extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

	@Override
	public String toString() {
		return "MiExcepcion [getMessage()=" + getMessage() + "]";
	}

	public MiExcepcion() {
		super();
	}
}
