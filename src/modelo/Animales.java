package modelo;

import java.util.Arrays;
import java.util.Objects;

public abstract class Animales {
	private String nombreEspecie;
	private TipoAnimal tipo;
	private String lugarDondeHabita;
	private Animales [] animalesQueCome;
	private Animales [] animalesComido;
	
	@Override
	public String toString() {
		return "Animales [nombreEspecie=" + nombreEspecie + ", tipo=" + tipo + ", lugarDondeHabita=" + lugarDondeHabita
				+ ", animalesQueCome=" + Arrays.toString(animalesQueCome) + ", animalesComido="
				+ Arrays.toString(animalesComido) + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(animalesComido);
		result = prime * result + Arrays.hashCode(animalesQueCome);
		result = prime * result + Objects.hash(lugarDondeHabita, nombreEspecie, tipo);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animales other = (Animales) obj;
		return Arrays.equals(animalesComido, other.animalesComido)
				&& Arrays.equals(animalesQueCome, other.animalesQueCome)
				&& Objects.equals(lugarDondeHabita, other.lugarDondeHabita)
				&& Objects.equals(nombreEspecie, other.nombreEspecie) && tipo == other.tipo;
	}
	
	public String getNombreEspecie() {
		return nombreEspecie;
	}
	public void setNombreEspecie(String nombreEspecie) {
		this.nombreEspecie = nombreEspecie;
	}
	public TipoAnimal getTipo() {
		return tipo;
	}
	public void setTipo(TipoAnimal tipo) {
		this.tipo = tipo;
	}
	public String getLugarDondeHabita() {
		return lugarDondeHabita;
	}
	public void setLugarDondeHabita(String lugarDondeHabita) {
		this.lugarDondeHabita = lugarDondeHabita;
	}
	public Animales[] getAnimalesQueCome() {
		return animalesQueCome;
	}
	public void setAnimalesQueCome(Animales[] animalesQueCome) {
		this.animalesQueCome = animalesQueCome;
	}
	public Animales[] getAnimalesComido() {
		return animalesComido;
	}
	public void setAnimalesComido(Animales[] animalesComido) {
		this.animalesComido = animalesComido;
	}
	
	abstract boolean atacar(Animales a);
	abstract boolean huir(Animales a);
}
