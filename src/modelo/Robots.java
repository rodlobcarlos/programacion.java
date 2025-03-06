package modelo;

import java.util.Objects;

public abstract class Robots {
	private int ID;
	private String modelo;
	private int bateria;
	protected Estado estado;
	private String combustible;
	private String descripcion;
	private String nombre;
	private static int contador;

	public Robots(int iD, String modelo, int bateria, Estado estado, String combustible, String descripcion,
			int contador ,String nombre) {
		super();
		ID = contador+1;
		this.modelo = modelo;
		setBateria(bateria);
		this.estado = estado;
		this.combustible = combustible;
		this.descripcion = descripcion;
		contador = contador+1;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getContador() {
		return contador;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		if (this.bateria > 10)
			this.bateria = bateria;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Robots other = (Robots) obj;
		return ID == other.ID;
	}

	abstract String ejecutarTarea();

	abstract boolean recargar();
}
