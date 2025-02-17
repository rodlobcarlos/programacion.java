package boletin_5;


public class Caballero extends Personaje {
	private int nivel;
	private int HP;

	public Caballero(String nombre, String arma, int nivel, int hP) {
		super(nombre, arma);
		this.nivel = nivel;
		HP = hP;
	}

	@Override
	public String toString() {
		return "Caballero [nivel=" + nivel + ", HP=" + HP + ", getNombre()=" + getNombre() + ", getArma()=" + getArma()
				+ "]";
	}
	
	protected int getNivel() {
		return nivel;
	}

	protected void setNivel(int nivel) {
		this.nivel = nivel;
	}

	protected int getHP() {
		return HP;
	}

	protected void setHP(int hP) {
		HP = hP;
	}


	boolean esAtacado(Personaje mago) {
		return true;
	}
	
	boolean esAtacado(Personaje arquero, int distancia) {
		boolean puedeAtacar;
		if (distancia > 100 && arquero instanceof Personaje) {
			puedeAtacar = true;
		}else {
			puedeAtacar = false;
		}
		return puedeAtacar;
	}
}
