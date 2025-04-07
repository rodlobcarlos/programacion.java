package comic_fest_España_modelo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RegistroEntradas {
	private HashMap<Influencers, EntradaVip> entradas; 

	public HashMap<Influencers, EntradaVip> getEntradas() {
		return entradas;
	}

	public void setEntradas(HashMap<Influencers, EntradaVip> entradas) {
		this.entradas = entradas;
	}

	@Override
	public String toString() {
		return "RegistroEntradas [entradas=" + entradas + "]";
	}

	public RegistroEntradas(HashMap<Influencers, EntradaVip> entradas) {
		super();
		this.entradas = new HashMap<Influencers, EntradaVip>();
	}
	
	public void agregarEntrada(Influencers influ, EntradaVip entrada) {
		entradas.put(influ, entrada);
		System.out.println("Entrada añadida");
	}
		
	public void buscarEntrada(Influencers nick, Influencers plataforma) {
		Set<Entry<Influencers, EntradaVip>> entrada = entradas.entrySet();
		Entry <Influencers, EntradaVip> elemento;
		Iterator it = entrada.iterator();
		
		while(it.hasNext()) {
			elemento = (Entry<Influencers, EntradaVip>) it.next();
			if(plataforma.) {
				
			}
			System.out.println(elemento);
		}
	}
}
