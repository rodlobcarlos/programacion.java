package videojuego.repositorio;

import java.util.*;
import java.util.Map.Entry;

import videojuego.modelo.EstadoJuego;
import videojuego.modelo.EstudioDesarrollo;
import videojuego.modelo.Juego;

public class PlataformaVideojuegos {

	// TODO Definir atributo plataforma usando estructura datos adecuada
	// TODO Justificar porqué eliges esta estructura

	private Map<Juego, EstudioDesarrollo> plataforma; // Uso esta estructura para almacenar parejas de datos.

	public PlataformaVideojuegos() {
		this.plataforma = new HashMap<Juego, EstudioDesarrollo>();
	}

	public void agregarJuego(Juego juego, EstudioDesarrollo estudio) {
		plataforma.put(juego, estudio);
		System.out.println("Juego agregado: " + plataforma);

	}

	public Juego buscarJuego(String titulo, String añoPublicacion) {
		Juego juego = null;
		Set<Map.Entry<Juego, EstudioDesarrollo>> juegos = plataforma.entrySet();
		Entry<Juego, EstudioDesarrollo> elemento;
		Iterator it = juegos.iterator();
		
		while (it.hasNext()) {
			elemento = (Entry<Juego, EstudioDesarrollo>) it.next();
			if (elemento.getKey().getTitulo().equals(titulo) 
					&& elemento.getKey().getAñoPublicacion().equals(añoPublicacion)) {
				System.out.println("Juego encontrado: " + elemento.getKey());
			}
		}
		return juego;
	}

	public boolean cambiarEstado(String titulo, String añoPublicacion, EstadoJuego nuevoEstado) {
		boolean modificado = false;
		Set<Map.Entry<Juego, EstudioDesarrollo>> juegos = plataforma.entrySet();
		Entry<Juego, EstudioDesarrollo> elemento;
		Iterator it = juegos.iterator();
		
		while (it.hasNext()) {
			elemento = (Entry<Juego, EstudioDesarrollo>) it.next();
			if (elemento.getKey().getTitulo() == titulo
					&& (elemento.getKey().getAñoPublicacion() == añoPublicacion)
							&& elemento.getKey().getEstado() != nuevoEstado) {
				modificado = true;
				System.out.println("El estado se ha modificado a: " + nuevoEstado);
			}
		}
		return modificado;
	}

	public List<Juego> top3PorDescargas() {
		List<Juego> juegosMasDescargados = null;
		int mayor = 0;
		for (Juego juegos : juegosMasDescargados) {
			if (juegos.getNumDescargas() > mayor) {
				mayor = juegos.getNumDescargas();
				juegosMasDescargados.add(juegos);
				System.out.println("El juego más descargado es: " + juegosMasDescargados);
			}
		}
		return juegosMasDescargados;
	}

	public List<Juego> filtrarPorPais(String pais) {
	    List<Juego> juegos = new ArrayList<Juego>();
	    Iterator<Map.Entry<Juego, EstudioDesarrollo>> itr = plataforma.entrySet().iterator();
	    
	    while(itr.hasNext()) {
	        Map.Entry<Juego, EstudioDesarrollo> entry = itr.next();
	        if(entry.getValue().getPais().equals(pais)) {
	            juegos.add(entry.getKey());
	        }
	    }
	    return juegos;
	}

}
