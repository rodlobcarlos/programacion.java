package registro_SinLuz;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class SinLuz implements Comparable<SinLuz>{

	private static int contador;
	private int id;
	private String nomrbe;
	private List<SinLuz> listaSinLuz;
	
	public SinLuz(int id, String nomrbe, List<SinLuz> listaSinLuz) {
		super();
		this.id = id;
		this.nomrbe = nomrbe;
		this.listaSinLuz = new ArrayList<SinLuz>();
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
	
	public List<SinLuz> getListaSinLuz() {
		return listaSinLuz;
	}

	public void setListaSinLuz(List<SinLuz> listaSinLuz) {
		this.listaSinLuz = listaSinLuz;
	}
	

	@Override
	public String toString() {
		return "SinLuz [id=" + id + ", nomrbe=" + nomrbe + ", listaEncuentros=" + listaEncuentros + "]";
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
	public int compareTo(SinLuz o) {
		int comparaPorNombre;
		return comparaPorNombre = this.nomrbe.compareTo(o.nomrbe);
	}
	
	SinLuz s;
	public void getSinLuz(int id) throws EldenException {
		if(listaSinLuz.contains(id)) {
			s.getId();
		}else {
			throw new EldenException("Este id no existe en el registro con"
					+ "con el id -> " + s.getId());
		}		
	}
}
