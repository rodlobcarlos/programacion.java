package registro_SinLuz;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SinLuz implements Comparable<SinLuz>{

	private static int contador;
	private int id;
	private String nomrbe;
	private Set<Encuentro> encuentros;
	
	public SinLuz(String nomrbe) {
		super();
		this.id = id;
		this.nomrbe = nomrbe;
		this.encuentros = new TreeSet<Encuentro>();
	}

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

	public String getNomrbe() {
		return nomrbe;
	}

	public void setNomrbe(String nomrbe) {
		this.nomrbe = nomrbe;
	}
	
	public Set<Encuentro> getListaSinLuz() {
		return encuentros;
	}

	public void setListaSinLuz(Set<Encuentro> encuentros) {
		this.encuentros = encuentros;
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
		SinLuz other = (SinLuz) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "SinLuz [id=" + id + ", nomrbe=" + nomrbe + ", encuentros=" + encuentros + "]";
	}

	@Override
	public int compareTo(SinLuz o) {
		return this.nomrbe.compareTo(o.nomrbe);
	}

	public void agregarEncuentro(Encuentro e) {
		encuentros.add(e);
	}
	
}
