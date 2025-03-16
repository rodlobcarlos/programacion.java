package productosMain_controlador;

import java.time.LocalDate;

import productosSupermercado_modelo.Pescado;
import productosSupermercado_modelo.TipoPescado;

public class ProductosMain {

	public static void main(String[] args) {
		Pescado[] pescados = new Pescado[2];
		
		Pescado pescado = new Pescado(1, "Dorada", "Grande", 1.2f, 10f, 12f, 1.3f, "el mar", 2f, LocalDate.of(2025, 02, 2), TipoPescado.BLANCO, 5);
	}

}
