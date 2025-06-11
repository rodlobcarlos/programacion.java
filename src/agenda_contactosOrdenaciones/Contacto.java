package agenda_contactosOrdenaciones;

import java.util.Objects;

public class Contacto implements Comparable<Contacto>{

	private String nombre;
	private String apellidos;
	private String email;
	private String direccion;
	private int numero_telefono;
	
	public Contacto(String nombre, String apellidos, String email, String direccion, int numero_telefono) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.direccion = direccion;
		this.numero_telefono = numero_telefono;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumero_telefono() {
		return numero_telefono;
	}

	public void setNumero_telefono(int numero_telefono) {
		this.numero_telefono = numero_telefono;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", direccion="
				+ direccion + ", numero_telefono=" + numero_telefono + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public int compareTo(Contacto o) {
		int comparaPorNombre = this.nombre.compareTo(o.nombre);
		if(comparaPorNombre != 0) {
			return comparaPorNombre;
		}
		return this.apellidos.compareTo(o.apellidos);
	}
  
}
