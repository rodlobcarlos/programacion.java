package actsOrientacionObj;

public class LibrosMain {
// clase Main
	public static void main(String[] args) {
		Libro libro1 = new Libro("ISBN12343243545456", "libro programación", "Carlos", 100); // Le paso los atributos de la clase Libro
		
		libro1.tituloPag(); // Imprime el número de páginas y el título del libro
	}

}
