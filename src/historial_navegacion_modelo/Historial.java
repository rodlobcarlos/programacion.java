package historial_navegacion_modelo;

import java.util.TreeSet;

public class Historial {
	private TreeSet<Historial> historial1;

	public TreeSet<Historial> getHistorial1() {
		return historial1;
	}

	public void setHistorial1(TreeSet<Historial> historial1) {
		this.historial1 = historial1;
	}

	public Historial(TreeSet<Historial> historial1) {
		super();
		this.historial1 = historial1;
	}

	@Override
	public String toString() {
		return "Historial [historial1=" + historial1 + "]";
	}
	
	
}
