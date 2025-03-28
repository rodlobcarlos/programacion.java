package listas;

import java.util.LinkedList;
import java.util.List;

public class ListaProvincia {
	private List <Provincia> provincias;
	
	public ListaProvincia() {
		super();
		this.provincias = new LinkedList<Provincia>();
	}

	public List<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(List<Provincia> provincias) {
		this.provincias = provincias;
	}
	
	boolean addSinRepetidos(Provincia p) throws ExecpcionProvincia {
		boolean agregar = false;
		if(provincias.contains(p)) {
			throw new ExecpcionProvincia("Provincia repetida");
		}else {
			agregar = provincias.add(p);
		}
		return agregar;
	}
	
	Provincia setRepetidos(int index, Provincia nueva_provincia) throws ExecpcionProvincia {
		Provincia actual = provincias.get(index);
		if(provincias.contains(nueva_provincia)) {
			throw new ExecpcionProvincia("Provincia repetida");
		}else {
			actual = provincias.set(index, actual);
		}
		return actual;
		
	}
	
}
