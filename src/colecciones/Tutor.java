package colecciones;

import java.util.List;

public class Tutor extends Grupo{

	public Tutor(String nombre, int id, List<Notas> listaNotas) {
		super(nombre, id, listaNotas);
		// TODO Auto-generated constructor stub
	}
	private String aula;
	private String horario;
	
	public Tutor(String nombre, int id, List<Notas> listaNotas, String aula, String horario) {
		super(nombre, id, listaNotas);
		this.aula = aula;
		this.horario = horario;
	}

	public String isImpartirClases() {
		return aula;
	}

	public void setImpartirClases(String aula) {
		this.aula = aula;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
	
}
