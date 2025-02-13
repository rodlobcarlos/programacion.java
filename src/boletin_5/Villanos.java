package boletin_5;

public class Villanos extends Personaje{
	private int nivel;
	private int HP;
	
	
	public Villanos(String nombre, String arma, int nivel, int hP) {
		super(nombre, arma);
		this.nivel = nivel;
		HP = hP;
	}

	@Override
	public String toString() {
		return "Villanos [nivel=" + nivel + ", HP=" + HP + ", getNombre()=" + getNombre() + ", getArma()=" + getArma()
				+ "]";
	}
	
}