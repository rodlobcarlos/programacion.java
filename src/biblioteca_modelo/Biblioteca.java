package biblioteca_modelo;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List <Libro> libros;

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Biblioteca [libros=" + libros + "]";
	}

	public Biblioteca(List<String> libros) {
		super();
		this.libros = new ArrayList<Libro>();
	}
	
	public List<Libro> agregarLibro(Libro l){
		if(l.equals(l)) {
			libros.add(l);
		}
		return null;
		
	}
}
