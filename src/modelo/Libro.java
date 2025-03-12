package modelo;

public class Libro extends RecursosAPrestar{
	private String autor;
	private String editorial;
	private String generoLiterario;
	
	@Override
	public String toString() {
		return "Libros [autor=" + autor + ", editorial=" + editorial + ", generoLiterario=" + generoLiterario
				+ "]";
	}

	public Libro(int id, String ubicacion, String autor, String editorial, String generoLiterario) {
		super(id, ubicacion);
		this.autor = autor;
		this.editorial = editorial;
		this.generoLiterario = generoLiterario;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getGeneroLiterario() {
		return generoLiterario;
	}

	public void setGeneroLiterario(String generoLiterario) {
		this.generoLiterario = generoLiterario;
	}

	@Override
	public boolean estaDiponible() {
		return false;
	}

	@Override
	public int getDevuelveDiasPrestamo() {
		return 21;
	}
}
