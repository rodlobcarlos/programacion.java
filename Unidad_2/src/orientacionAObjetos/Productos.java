package orientacionAObjetos;

public class Productos {
	String nombre;
	int num_unidades;
	float precioVenta;
	
	boolean hayQuePedirStock() {
		 	boolean pedir = true;
		 	if(num_unidades < 2) {
		 		pedir = true;
		 	}else {
		 		pedir = false;
		 	}
		 	return pedir;
	}
	int actualizaStock(int aumento) {
		int unidadAumentada = num_unidades + aumento; 
		return unidadAumentada;
	}
	String pasaACadena() {
		String cadena = "Las unidades actuales del producto es de" + num_unidades;
		return cadena;
	}
}