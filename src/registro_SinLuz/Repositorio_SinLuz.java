package registro_SinLuz;

import java.util.Set;
import java.util.TreeSet;

public class Repositorio_SinLuz {

	private Set<Encuentro> encuentroSinLuz;

	public Set<Encuentro> getEncuentroSinLuz() {
		return encuentroSinLuz;
	}

	public void setEncuentroSinLuz(Set<Encuentro> encuentroSinLuz) {
		this.encuentroSinLuz = encuentroSinLuz;
	}

	public Repositorio_SinLuz(Set<Encuentro> encuentroSinLuz) {
		super();
		this.encuentroSinLuz = new TreeSet<Encuentro>();
	}

	@Override
	public String toString() {
		return "Repositorio_SinLuz [encuentroSinLuz=" + encuentroSinLuz + "]";
	}
	
	
}
