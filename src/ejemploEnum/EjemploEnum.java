package ejemploEnum;

public class EjemploEnum {

enum Color{
	rojo, azul, verde, amarillo, naranja, negro
}
	
	public static void main(String[] args) {
		Color color = Color.azul;
		System.out.println("El color es: " + color);
		
		for (Color c : color.values()) {
			System.out.println("Color: " + c);
		}
	}

}
