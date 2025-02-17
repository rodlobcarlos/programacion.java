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
		return "Caballero [nivel=" + nivel + ", HP=" + HP + ", nombre=" + getNombre() + ", arma=" + getArma()
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


	boolean esAtacado(Personaje personaje) {
		boolean puedeAtacar;
		if (personaje instanceof Mago) {
			puedeAtacar = true;
		}else {
			puedeAtacar = false;
		}
		return true;
	}
	
	boolean esAtacado(Personaje personaje, int distancia) {
		boolean puedeAtacar;
<<<<<<< HEAD
		if (distancia > 100 && arquero instanceof Personaje) {
=======
		if (personaje instanceof Arquero && distancia > 100) {
>>>>>>> ae7ce2722a6c9d58efa6d7f114391d7e4b4c6f48
			puedeAtacar = true;
		}else {
			puedeAtacar = false;
		}
		return puedeAtacar;
	}
}
