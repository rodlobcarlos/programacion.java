package biblioteca_modelo;

public class Libro {
	private String titulo;
	private String genero;
	private String año_publicacion;
	private EstadoLibro estado;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getAño_publicacion() {
		return año_publicacion;
	}
	public void setAño_publicacion(String año_publicacion) {
		this.año_publicacion = año_publicacion;
	}
	public EstadoLibro getEstado() {
		return estado;
	}
	public void setEstado(EstadoLibro estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", genero=" + genero + ", año_publicacion=" + año_publicacion + ", estado="
				+ estado + "]";
	}
	public Libro(String titulo, String genero, String año_publicacion, EstadoLibro estado) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.año_publicacion = año_publicacion;
		this.estado = estado;
	}
}
