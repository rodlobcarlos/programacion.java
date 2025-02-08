package orientacionObjetos;

public class MainProductos {

	public static void main(String[] args) {
		Productos papel = new Productos();
		papel.nombre = "Papel";
		papel.num_unidades = 5;
		papel.precioVenta = 3;
		
		boolean pedir = papel.hayQuePedirStock();
		System.out.println("Hay que pedir stock: ");
		
		pedir = cafe.hayQuePedirStock();
		System.out.println("Hay que pedir stock: ");
		
		int aumento = papel.actualizaStock(1);
		System.out.println(aumento);
	}
}