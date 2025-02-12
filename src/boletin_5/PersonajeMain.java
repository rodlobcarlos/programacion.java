package boletin_5;

public class PersonajeMain {

	public static void main(String[] args) {
		Mago jpg1 = new Mago("Federico", "hechizo", 13, 140);
		Arquero jpg2 = new Arquero("Juan", "flechas", 50, 100);
		Caballero jpg3 = new Caballero("Clemente", "Espada", 59, 103);
		Villanos jpg4 = new Villanos("Matilde", " ", 40, 24);
		
		System.out.println(jpg1);
		System.out.println("Arma: " + jpg1.getArma());
		
		System.out.println(jpg2);
		System.out.println("Arma: " + jpg2.getArma());
		
		System.out.println(jpg3);
		System.out.println("Arma: " + jpg3.getArma());
		
		System.out.println(jpg4);
		System.out.println("Arma: " + jpg4.getArma());

		System.out.println("Caballero es atacado por arquero: " + jpg3.esAtacado(jpg2, 99));
		System.out.println("Caballero es atacado por mago: " + jpg3.esAtacado(jpg1));
		
		System.out.println("Arquero es atacado por caballero: " + jpg2.esAtacado(jpg3, 51));
		System.out.println("Arquero es atacado por mago: " + jpg2.esAtacado(jpg1));
		
		System.out.println("Villano es atacado por mago: " + jpg4.esAtacado(jpg1));
		System.out.println("Villano es atacado por caballero: " + jpg4.esAtacado3(jpg3, 4));
		System.out.println("Villano es atacado por arquero': " + jpg4.esAtacado5(jpg2, 30));
		
		System.out.println("El mago no le ataca a nadie.");
		
	}

}
