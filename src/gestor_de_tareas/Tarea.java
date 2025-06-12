package gestor_de_tareas;

public class Tarea implements Comparable<Tarea>{

	private static int contador;
	private int id;
	private String categoria;
	private String descripcion;
	private int prioridad;
	
	public Tarea(int id, String categoria, String descripcion, int prioridad) {
		super();
		this.id = contador+1;
		this.categoria = categoria;
		this.descripcion = descripcion;
		this.prioridad = prioridad;
		contador = contador+1;
	}

	@Override
	public String toString() {
		return "Tarea [id=" + id + ", categoria=" + categoria + ", descripcion=" + descripcion + ", prioridad="
				+ prioridad + "]";
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Tarea.contador = contador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	@Override
	public int compareTo(Tarea o) {
		int prioridad;
		if(comparaPrioridad != 0) {
			return comparaPrioridad;
		}
		return 0;
	}

	
}
