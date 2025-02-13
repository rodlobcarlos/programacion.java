package boletin_5;

public class Arquero extends Personaje{
	private int nivel;
	private int HP;

	public Arquero(String nombre, String arma, int nivel, int hP) {
		super(nombre, arma);
		this.nivel = nivel;
		HP = hP;
	}

	@Override
	public String toString() {
		return "Arquero [nivel=" + nivel + ", HP=" + HP + ",nombre =" + getNombre() + ", getArma()=" + getArma()
				+ "]";
	}

	boolean esAtacado(Personaje mago) {
		return true;
	}
	
	boolean esAtacado(Personaje caballero, int distancia) {
		boolean puedeAtacar;
		if (distancia < 50) {
			puedeAtacar = true;
		}else {
			puedeAtacar = false;
		}
		return puedeAtacar;
	}
}
