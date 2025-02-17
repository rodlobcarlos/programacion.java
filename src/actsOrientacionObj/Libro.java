package actsOrientacionObj;

public class Libro {
	
	// atributos publicos
	public String ISBN;
	public String titulo;
	public String autor;
	public int numPag;
	
	// getters and setters
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumPag() {
		return numPag;
	}
	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	
	// contructor toString
	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag + "]";
	}
	
	// constructor super()
	public Libro(String iSBN, String titulo, String autor, int numPag) {
		super();
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
	}
	 // metodo para imprimir solo el titulo y el número de páginas del libro
	void tituloPag() {
		System.out.println("Título: " + titulo);
		System.out.println("Páginas: " + numPag);
	}
}
