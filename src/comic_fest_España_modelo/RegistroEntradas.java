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

	public HashMap<Influencers, EntradaVip> buscarEntrada(Influencers f) {
		if (entradas.containsKey(f.getNick()) && entradas.containsKey(f.getPlataforma())) {
			return entradas;
		} else {
			return null;
		}
	}

	public boolean confirmarAsistencia() {
		Influencers f;
		boolean confirmar = false;
		if (entradas.containsKey(f.getNick()) && entradas.containsKey(f.getPlataforma())) {
			Estadoentrada estado = Estadoentrada.CONFIRMADA;
			confirmar = true;
		} else {
			Estadoentrada estado = Estadoentrada.CANCELADA;
			confirmar = false;
			System.out.println(f.toString());
		}
		return confirmar;
	}

	Influencers f;
	public boolean listadoEntradaConfir(Estadoentrada e) {
		boolean confirmada = false;
		Map<Influencers, EntradaVip> entrada = new HashMap<>();
		Set<Map.Entry<Influencers, EntradaVip>> entradas = entrada.entrySet();
		Entry<Influencers, EntradaVip> elemento;
		Iterator it = entradas.iterator();

		while (it.hasNext()) {
			elemento = (Entry<Influencers, EntradaVip>) it.next();
			if (e.equals(Estadoentrada.CONFIRMADA)) {
				confirmada = true;
				System.out.println(f.toString());
			}
		}
		return confirmada;
	}
	
	public boolean listadoPendienteConfirCancel(Estadoentrada e){
		boolean pendiente = false;
		Map<Influencers, EntradaVip> entrada = new HashMap<>();
		Set<Map.Entry<Influencers, EntradaVip>> entradas = entrada.entrySet();
		Entry<Influencers, EntradaVip> elemento;
		Iterator it = entradas.iterator();

		while (it.hasNext()) {
			elemento = (Entry<Influencers, EntradaVip>) it.next();
			if (e.equals(Estadoentrada.ENVIADA)) {
				pendiente = true;
			}
		}
		return pendiente;
	}
	
	public HashMap<Influencers, EntradaVip> listadoNumSeguidores(){
		return entradas;
		
	}
}