package reservas_eventos;

import java.util.Objects;

public class Usuario implements Comparable<Usuario>{

	private static int contador;
	private int id;
	private String nombre_completo;
	private String email;
	
	public Usuario(int id, String nombre_completo, String email) {
		super();
		this.id = contador+1;
		this.nombre_completo = nombre_completo;
		this.email = email;
		contador = contador+1;
	}
	
	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Usuario.contador = contador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre_completo() {
		return nombre_completo;
	}

	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre_completo=" + nombre_completo + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return id == other.id;
	}

	@Override
	public int compareTo(Usuario o) {
		Integer comparaPorId = new int(id, id);
		return 0;
	}
	
	
}
