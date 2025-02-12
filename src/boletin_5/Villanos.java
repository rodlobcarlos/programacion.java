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



	boolean esAtacado(Personaje mago) {
		return true;
	}
	
	boolean esAtacado1(Personaje mago, int distancia) {
		boolean puedeAtacar;
		if (distancia >= 0) {
			puedeAtacar = true;
		}else {
			puedeAtacar = false;
		}
		return puedeAtacar;
	}
	
	boolean esAtacado2(Personaje caballero) {
		return true;
	}
	
	boolean esAtacado3(Personaje caballero, int distancia) {
		boolean puedeAtacar;
		if (distancia >= 0) {
			puedeAtacar = true;
		}else {
			puedeAtacar = false;
		}
		return puedeAtacar;
	}
	
	boolean esAtacado4(Personaje arquero) {
		return true;
	}
	
	boolean esAtacado5(Personaje arquero, int distancia) {
		boolean puedeAtacar;
		if (distancia >= 0) {
			puedeAtacar = true;
		}else {
			puedeAtacar = false;
		}
		return puedeAtacar;
	}
}
