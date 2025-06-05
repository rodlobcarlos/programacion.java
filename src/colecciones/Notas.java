package colecciones;

import java.util.List;

public class Notas extends Estudiante{

	public Notas(String nombre, int id, List<Notas> listaNotas) {
		super(nombre, id, listaNotas);
		// TODO Auto-generated constructor stub
	}

	private List<Notas> listaNotas;
	private float nota;

	public List<Notas> getListaNotas() {
		return listaNotas;
	}

	public void setListaNotas(List<Notas> listaNotas) {
		this.listaNotas = listaNotas;
	}

	public Notas(String nombre, int id, List<Notas> listaNotas, List<Notas> listaNotas2) {
		super(nombre, id, listaNotas);
		listaNotas = listaNotas2;
	}

	@Override
	public String toString() {
		return "Notas [listaNotas=" + listaNotas + "]";
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
	
	
}
