package listas1_0;

import java.util.HashSet;
import listas.Provincia;

public class Lista_provincias {
	private HashSet<Provincia> provincias;

	public HashSet<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(HashSet<Provincia> provincias) {
		this.provincias = provincias;
	}

	public Lista_provincias(HashSet<Provincia> provincias) {
		super();
		this.provincias = provincias;
	}
	
	
	
}
