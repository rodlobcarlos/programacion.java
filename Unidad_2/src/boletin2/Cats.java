package boletin2;

public class Cats {
	String color;
	String race;
	String sex;
	int edge;
	float weight;

	String maullar() {
		String maulla = "miauuuuuuuuu";
		System.out.println(maulla);
		return maulla;
	}

	String ronronear() {
		String ronronea = "rrrrrrrrrrr";
		System.out.println(ronronea);
		return ronronea;
	}

	String food = "pescado";

	void eat(String food) {
		if (food.equals("pescado")) {
			System.out.println("Yummy, yummy");
		} else {
			System.out.println("buahhh, mejor no");
		}
	}

	void fight(Cats c) {
		if (c.sex.equals(sex)) {
			System.out.println("Ven aquí que te vas a enterar");
		} else {
			System.out.println("La violencia nunca es la solución");
		}
	}
}