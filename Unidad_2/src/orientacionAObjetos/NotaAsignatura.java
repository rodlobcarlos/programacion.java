package orientacionAObjetos;

public class NotaAsignatura {
	NotaAsignatura nota = new NotaAsignatura();
	String nombre;
	int primT;
	int segnT;
	int tercT;
	
	public NotaAsignatura(NotaAsignatura nota, String nombre, int primT, int segnT, int tercT) {
		super();
		this.nota = nota;
		this.nombre = nombre;
		this.primT = primT;
		this.segnT = segnT;
		this.tercT = tercT;
	}

	public NotaAsignatura() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NotaAsignatura [nota=" + nota + ", nombre=" + nombre + ", primT=" + primT + ", segnT=" + segnT
				+ ", tercT=" + tercT + "]";
	}
	
	float calculaMedia() {
		float media = ();
	}
	
	int calculaNumTAP() {
		
	}
	
}