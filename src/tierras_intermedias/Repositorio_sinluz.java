package tierras_intermedias;

import java.util.Set;
import java.util.TreeSet;

public class Repositorio_sinluz {

	private Set<SinLuz> listaSinLuz;

	public Repositorio_sinluz(Set<SinLuz> listaSinLuz) {
		super();
		this.listaSinLuz = new TreeSet<SinLuz>();
	}

	@Override
	public String toString() {
		return "Repositorio_sinluz [listaSinLuz=" + listaSinLuz + "]";
	}

	public Set<SinLuz> getListaSinLuz() {
		return listaSinLuz;
	}

	public void setListaSinLuz(Set<SinLuz> listaSinLuz) {
		this.listaSinLuz = listaSinLuz;
	}
		
	public SinLuz getSinLuz(SinLuz s) throws EldenException {
		if(listaSinLuz.contains(s)) {
			System.out.println("El id del SinLuz es -> " + s.getId());
			return s;
		}else {
			throw new EldenException("No existe el SinLuz con el id: " + s.getId());
		}		
	}
	
	public boolean agregaEncuentro(Encuentro e, SinLuz s) throws EldenException {
		boolean agregado = false;
		SinLuz sinluz = this.getSinLuz(s);
		sinluz.getListaEncuentros().add(e);
		agregado = true;
		return agregado;
	}
	
	
}
