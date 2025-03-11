package modelo;

public class Libros extends RecursosAPrestar implements IPrestable {
	private String autor;
	private String editorial;
	private String generoLiterario;
	private int diaPrestamo;

	public int getDiaPrestamo() {
		return diaPrestamo;
	}

	public void setDiaPrestamo(int diaPrestamo) {
		this.diaPrestamo = diaPrestamo;
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

	public Libros(int id, String ubicacion) {
		super(id, ubicacion);
		// TODO Auto-generated constructor stub
	}

	public Libros(int id, String ubicacion, String autor, String editorial, String generoLiterario, int diaPrestamo) {
		super(id, ubicacion);
		this.autor = autor;
		this.editorial = editorial;
		this.generoLiterario = generoLiterario;
		this.diaPrestamo = diaPrestamo;
	}

	@Override
	public String toString() {
		return "Libros [autor=" + autor + ", editorial=" + editorial + ", generoLiterario=" + generoLiterario
				+ ", diaPrestamo=" + diaPrestamo + "]";
	}

	@Override
	public boolean estaDiponible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getDevuelveDiasPrestamo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
