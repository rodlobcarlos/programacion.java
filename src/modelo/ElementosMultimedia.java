package modelo;

public abstract class ElementosMultimedia extends RecursosAPrestar {
	private String nombre;
	private String genero;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public ElementosMultimedia(int id, String ubicacion) {
		super(id, ubicacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ElementosMultimedia [nombre=" + nombre + ", genero=" + genero + "]";
	}

	public ElementosMultimedia(int id, String ubicacion, String nombre, String genero) {
		super(id, ubicacion);
		this.nombre = nombre;
		this.genero = genero;
	}
}
