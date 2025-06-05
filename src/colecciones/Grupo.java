package colecciones;

import java.util.List;

public class Grupo extends Estudiante{
	
	public Grupo(String nombre, int id, List<Notas> listaNotas) {
		super(nombre, id, listaNotas);
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String descripcion; 
	private List<Estudiante> listaEstudiantes;
	private String tutor;
	private Tutor datosTutor;
	
	public Grupo(String nombre, int id, List<Notas> listaNotas, int id2, String descripcion,
			List<Estudiante> listaEstudiantes, String tutor, Tutor datosTutor) {
		super(nombre, id, listaNotas);
		id = id2;
		this.descripcion = descripcion;
		this.listaEstudiantes = listaEstudiantes;
		this.tutor = tutor;
		this.datosTutor = datosTutor;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}
	public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}
	public String getTutor() {
		return tutor;
	}
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}
	public Tutor getDatosTutor() {
		return datosTutor;
	}
	public void setDatosTutor(Tutor datosTutor) {
		this.datosTutor = datosTutor;
	}
	@Override
	public String toString() {
		return "Grupo [id=" + id + ", descripcion=" + descripcion + ", listaEstudiantes=" + listaEstudiantes
				+ ", tutor=" + tutor + ", datosTutor=" + datosTutor + "]";
	}
	
	

}
