package colecciones;

import java.util.List;

public abstract class Estudiante {

	private String nombre;
	private int id;
	private List<Estudiante> listaEstudiante;
	private List<Notas> listaNotas;
	
	public Estudiante(String nombre, int id, List<Notas> listaNotas) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.listaNotas = listaNotas;
	} 

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Notas> getListaNotas() {
		return listaNotas;
	}

	public void setListaNotas(List<Notas> listaNotas) {
		this.listaNotas = listaNotas;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", id=" + id + ", listaNotas=" + listaNotas + "]";
	}
	
	public void agregarEstudiante(Estudiante e) {
		if(listaEstudiante.contains(e)) {
			System.out.println("Este estudiante está en la lista.");
		}else {
			listaEstudiante.add(e);
		}
	} 
	
	public void agregarNotas(Notas n) {
		if(listaNotas.contains(n)) {
			System.out.println("Esta nota ya está.");
		}else {
			listaNotas.add(n);
		}
	}
	
	public Notas mostrarEstudiantes() {
		for(Estudiante est : listaEstudiante) {
			System.out.println(est + getNota());
		}
	}
	
	public void promedio() {
		float promedio = 
	}
}
