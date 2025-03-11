package modelo;

import java.util.Objects;

public class Peliculas extends ElementosMultimedia{
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

	public Peliculas(int id, String ubicacion, String nombre, String genero) {
		super(id, ubicacion);
		this.nombre = nombre;
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Peliculas [nombre=" + nombre + ", genero=" + genero + "]";
	}

	public Peliculas(int id, String ubicacion) {
		super(id, ubicacion);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(genero, nombre);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peliculas other = (Peliculas) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nombre, other.nombre);
	}
	
	int duracionMinutos() {
		return 0;
	}
}
