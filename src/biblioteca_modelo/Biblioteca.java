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

	public Biblioteca() {
		super();
		this.libros = new ArrayList<Libro>();
	}
	
	public void agregarLibro(Libro l){
		libros.add(l);
		System.out.println(l + " ha sido añadido");
	}
	
	EstadoLibro estado;
	public void prestarLibro(Libro l) throws BibliotecaException {
		for(Libro libro : libros) {
			if(libros.contains(libro) && estado.equals(EstadoLibro.PRESTADO)) {
				l.setEstado(EstadoLibro.PRESTADO);
				System.out.println(l + " está prestado");
			}else {
				throw new BibliotecaException("Este libro no está en el inventario o está en estado libre");
			}
		}
	}
	
}
