package rodriguez_carlos_Examen1;

import java.util.Arrays;
import java.util.Objects;

public abstract class MiembroBase {
	private int id;
	private String email;
	private String nombre;
	protected MiembroBase[] amigos;
	private int contadorAmigos;
	private static int contadorIdentificador;

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

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

	protected MiembroBase[] getAmigos() {
		return amigos;
	}

	protected void setAmigos(MiembroBase[] amigos) {
		this.amigos = amigos;
	}

	protected int getContadorAmigos() {
		return contadorAmigos;
	}

	protected void setContadorAmigos(int contadorAmigos) {
		this.contadorAmigos = contadorAmigos;
	}

	protected static int getContadorIdentificador() {
		return contadorIdentificador;
	}

	protected static void setContadorIdentificador(int contadorIdentificador) {
		MiembroBase.contadorIdentificador = contadorIdentificador;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MiembroBase other = (MiembroBase) obj;
		return Objects.equals(email, other.email) && id == other.id;
	}

	@Override
	public String toString() {
		return "MiembroBase [id=" + id + ", email=" + email + ", nombre=" + nombre + "]";
	}

	public MiembroBase(String email, String nombre, MiembroBase[] amigos, int contadorAmigos) {
		super();
		this.id = contadorIdentificador + 1;
		this.email = email;
		this.nombre = nombre;
		this.amigos = amigos;
		this.contadorAmigos = contadorAmigos;
		contadorIdentificador = contadorIdentificador + 1;
	}

	abstract String getTipoUsuario();

	boolean isAmigo(MiembroBase miembro) throws GuzmanitosException {
		boolean esta_en_lista = false;
		for (MiembroBase m : amigos) {
			if (miembro.equals(m)) {
				esta_en_lista = true;
				throw new GuzmanitosException("El miembro " + miembro + "ya esta en la lista de amigos del miembro " + miembro);
			} else {
				miembro = (MiembroBase) m;
				esta_en_lista = false;
			}
		}
		return esta_en_lista;

	}
}