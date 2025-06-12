package gestor_de_tareas;

import java.util.ArrayList;
import java.util.List;

public class Coleccion {

	private List<Tarea> listaTarea;

	public Coleccion(List<Tarea> listaTarea) {
		super();
		this.listaTarea = new ArrayList<Tarea>();
	}

	@Override
	public String toString() {
		return "Coleccion [listaTarea=" + listaTarea + "]";
	}

	public List<Tarea> getListaTarea() {
		return listaTarea;
	}

	public void setListaTarea(List<Tarea> listaTarea) {
		this.listaTarea = listaTarea;
	}
	
	public void agregarTarea(Tarea t) {
		if(!listaTarea.contains(t)) {
			listaTarea.add(t);
		}else {
			System.out.println("Esta tarea ya está en la colección.");
		}
	}
	
	public void eliminarTarea(Tarea t) {
		if(listaTarea.contains(t)) {
			listaTarea.add(t);
		}else {
			System.out.println("Esta tarea no está en la colección.");
		}
	}
	
	public List<Tarea> mostrarTareas() {
		return listaTarea;
		
	}
	
	public void mostrarPrioridadAlta() {
		// POR TERMINAR
	}
}
