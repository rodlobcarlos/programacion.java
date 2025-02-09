package boletin_2;

public class Cube {
	int side;
	float liters;
	float capacidad;

	public Cube(int side, float liters) {
		super();
		this.side = side;
		this.liters = liters;
		this.capacidad = volume();
	}

	@Override
	public String toString() {
		return "Cube [side=" + side + ", liters=" + liters + ", capacidad=" + capacidad + "]";
	}

	int area() {
		int area = 6 * side * side;
		return area;
	}

	int volume() {
		int volume = side * side * side;
		return volume;
	}

	boolean fill_out(float litersaMeter) {
		boolean posibleFill_out = true;
		if (litersaMeter + liters >= capacidad) {
			posibleFill_out = false;
		} else {

			liters = liters + litersaMeter;
		}
		return posibleFill_out;
	}

	boolean empty(float litersaSacar) {
		boolean possibleEmpty = true;
		if (litersaSacar >= liters) {
			possibleEmpty = false;
		} else {

	liters = liters - litersaSacar;	
	}
		return possibleEmpty;
	}
}