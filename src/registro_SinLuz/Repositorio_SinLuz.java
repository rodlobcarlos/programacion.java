package registro_SinLuz;

import java.util.Set;
import java.util.TreeSet;

public class Repositorio_SinLuz {

	private Set<SinLuz> sinluz;

	public Set<SinLuz> getEncuentroSinLuz() {
		return sinluz;
	}

	public void setEncuentroSinLuz(Set<SinLuz> sinluz) {
		this.sinluz = sinluz;
	}

	public Repositorio_SinLuz() {
		super();
		this.sinluz = new TreeSet<SinLuz>();
	}

	@Override
	public String toString() {
		return "Repositorio_SinLuz [encuentroSinLuz=" + sinluz + "]";
	}
	
	public void agregarSinLuz(SinLuz sl) {
		sinluz.add(sl);
	}
	
	public SinLuz getSinLuz(int id) throws EldenException {
		for(SinLuz sl : sinluz) {
			if(sl.getId() == id) { 
				return sl;
			}
		}
		throw new EldenException("No existe el SinLuz con el id: " + id);
	}
	
	public void agregarEncuentro(Encuentro e, int id) throws EldenException {
		SinLuz sinluz = getSinLuz(id); // Lanza la excepcion si no existe.
		sinluz.agregarEncuentro(e);
	}
	
	
}
