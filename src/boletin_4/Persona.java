package boletin_4;

import java.util.Objects;

public class Persona {
	private String nombre;
	private String email;

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre, String email) {
		super();
		this.nombre = nombre;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(email, other.email) && Objects.equals(nombre, other.nombre);
	}
}
