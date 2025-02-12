package boletin_5;

public class Mago extends Personaje{
	private int nivel;
	private int HP;

	@Override
	public String toString() {
		return "Mago [nivel=" + nivel + ", HP=" + HP + ", getNombre()=" + getNombre() + ", getArma()=" + getArma()
				+ "]";
	}

	public Mago(String nombre, String arma, int nivel, int hP) {
		super(nombre, arma);
		this.nivel = nivel;
		HP = hP;
	}

	boolean esAtacado(Personaje atacante) {
		return false;
	}
	
	boolean esAtacado(Personaje atacante, int distancia) {
		return false;
	}
}
