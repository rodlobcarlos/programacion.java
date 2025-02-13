package boletin_5;

public class PersonajeMain {

	public static void main(String[] args) {
		Mago p1 = new Mago("Federico", "hechizo", 13, 140);
		Arquero p2 = new Arquero("Juan", "flechas", 50, 100);
		Caballero p3 = new Caballero("Clemente", "Espada", 59, 103);
		Villanos p4 = new Villanos("Matilde", " ", 40, 24);
		
		System.out.println(p1);
		System.out.println("Arma: " + p1.getArma());
		
		System.out.println(p2);
		System.out.println("Arma: " + p2.getArma());
		
		System.out.println(p3);
		System.out.println("Arma: " + p3.getArma());
		
		System.out.println(p4);
		System.out.println("Arma: " + p4.getArma());

		System.out.println("Caballero es atacado por arquero: " + p3.esAtacado(p4, 109));
		System.out.println("Caballero es atacado por mago: " + p3.esAtacado(p1));
		
		System.out.println("Arquero es atacado por caballero: " + p2.esAtacado(p3, 51));
		System.out.println("Arquero es atacado por mago: " + p2.esAtacado(p1));
		
		System.out.println("Villano es atacado por mago: " + p4.esAtacado(p1));
		System.out.println("Villano es atacado por caballero: " + p4.esAtacado(p3));
		System.out.println("Villano es atacado por arquero': " + p4.esAtacado(p2));
		
		System.out.println("El mago no le ataca nadie.");
		
	}

}
