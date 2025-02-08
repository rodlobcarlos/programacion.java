package orientacionAObjetos;

public class Gatos {
	String raza;
	String color;
	String sexo;
	int edad;
	float peso;

	void maulla() {
		boolean maulla = true;
		if (maulla) {
			System.out.println("miuauuuuuu");
		}
	}

	String ronronea() {
		String ronronea = "rrrrrrr";
		System.out.println(ronronea);
		return ronronea;
	}

	String comida = "pescado";

	void come(String comida) {
		if (comida.equals("pescado")) {
			System.out.println(" Yummy Yummy");
		} else {
			System.out.println("buahhh, mejor no");
		}
	}

	void pelear(Gatos g) {
		if (sexo.equals(g.sexo)) {
			System.out.println("Ven aquí que te vas a enterar");
		} else {
			System.out.println("La violencia nunca es la solución");
		}
	}

	String pasaACadena() {
		return "Color: " + color + "sexo: " + sexo + "edad: " + edad + "peso: " + peso;
	}

	boolean fight() {
		boolean gana = true;
		if (sexo.equals(sexo)) {
			gana = true;
		} else {
			gana = false;
			System.out.println("Gana la macho: " + gana);
		}
		return gana;
	}
}