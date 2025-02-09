package orientacionObjetos;

public class Pokemon {
	String nombre;
	int nivel;
	String tipo;

	String convierteEnCadena() {
		String cadenaPikachu ="Pokemon 1:"+ "nombre:" + nombre + "nivel:" + nivel + "tipo:" +tipo;
		return cadenaPikachu;
	}
	boolean figth(Pokemon p2) {
		boolean gana = true;
		if(nivel >= p2.nivel) {
			gana = true;
			nivel = nivel + 1;
		}else {
			gana = false;
			p2.nivel = p2.nivel + 1;
		}
		return gana;
	}
}