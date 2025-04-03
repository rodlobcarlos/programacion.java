package historial_navegacion_modelo;

<<<<<<< HEAD
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
=======
import java.util.Iterator;
import java.util.TreeSet;

public class Historial {
	private TreeSet<PaginaWeb> historial;

	public TreeSet<PaginaWeb> getHistorial() {
		return historial;
	}

	public void setHistorial(TreeSet<PaginaWeb> historial) {
		this.historial = historial;
	}

	public Historial(TreeSet<PaginaWeb> historial) {
		super();
		this.historial = historial;
>>>>>>> 62b6b07068a58deda1e11cdd04506751a3c55335
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "Historial [historial1=" + historial1 + "]";
	}
	
	
=======
		return "Historial [historial=" + historial + "]";
	}
	
	// ITERAR SET HISTORIAL
	void consultarHistorialCompleto() {
		for(PaginaWeb pag : historial) {
			System.out.println(pag);
		}
	}
	
	// BUSCAR PAGINA POR UN DIA
/*	void consultarHistorialUnDia() {
		for(PaginaWeb dia: historial) {
		}
	}
*/	

/*	// BUSCAR PAGINA POR URL
	void consultarHistorialPorUrl() {
		for(PaginaWeb url : historial) {
		}
	}
*/
	
/*	// NO SE HACERLO, AHORA MISMO
	void borrarvisitasPagina() {
		
	}
*/ 
>>>>>>> 62b6b07068a58deda1e11cdd04506751a3c55335
}

