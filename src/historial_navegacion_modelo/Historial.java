package historial_navegacion_modelo;

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
	}

	@Override
	public String toString() {
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
}

