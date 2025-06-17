package tierras_intermedias;

import java.util.Objects;
import java.util.Set;

public class SinLuz implements Comparable<SinLuz>{

	private static int contador;
	private int id;
	private String nombre;
	private Set<Encuentro> listaEncuentros;

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		SinLuz.contador = contador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Encuentro> getListaEncuentros() {
		return listaEncuentros;
	}

	public void setListaEncuentros(Set<Encuentro> listaEncuentros) {
		this.listaEncuentros = listaEncuentros;
	}
	
	@Override
	public String toString() {
		return "SinLuz [id=" + id + ", nombre=" + nombre + ", listaEncuentros=" + listaEncuentros + "]";
	}

	public SinLuz(int id, String nombre, Set<Encuentro> listaEncuentros) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.listaEncuentros = listaEncuentros;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, listaEncuentros, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinLuz other = (SinLuz) obj;
		return id == other.id && Objects.equals(listaEncuentros, other.listaEncuentros)
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public int compareTo(SinLuz o) {
		int comparaPorNombre = this.nombre.compareTo(o.nombre);
		if(comparaPorNombre != 0) {
			return comparaPorNombre;
		}else {
			return 0;
		}
		
	}
	
}
