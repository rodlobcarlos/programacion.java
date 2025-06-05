package colecciones;

import java.util.List;

public class Instituto {

	private List<Grupo> listaGrupo;
	
	public void agragarGrupo(Grupo g) {
		if(listaGrupo.contains(g)) {
			System.out.println("Este grupo ya está en el instituto.");
		}else {
			listaGrupo.add(g);
		}
	}
}
