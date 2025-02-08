package boletin_2;

public class CatsMain {

	public static void main(String[] args) {
		Cats cat = new Cats();
		Cats cat2 = new Cats();
		Cats cat3 = new Cats();
		
		cat.color = "grey";
		cat.race = "race1";
		cat.sex = "male";
		cat.edge = 7;
		cat.weight = 4.5f;
		
		cat2.color = "black";
		cat2.race = "race2";
		cat2.sex = "female";
		cat2.edge = 9;
		cat2.weight = 5.6f;
		
		cat3.color = "white";
		cat3.race = "race3";
		cat3.sex = "female";
		cat3.edge = 10;
		cat3.weight = 4.3f;
		
		cat.maullar();
		cat.eat("pienso");
		
		cat2.ronronear();
		cat2.eat("pescado");
		
		cat.fight(cat);
	}

}
