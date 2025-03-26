package biblioteca_modelo;

import java.util.List;

public class Biblioteca {
	private List <String> libros;

	public List<String> getLibros() {
		return libros;
	}

	public void setLibros(List<String> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Biblioteca [libros=" + libros + "]";
	}
}
