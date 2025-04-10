package repositorioSimulacionEventos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;

import simulacionReservasEntradasEventos_modelo.Eventos;
import simulacionReservasEntradasEventos_modelo.Reserva;
import simulacionReservasEntradasEventos_modelo.ReservaException;
import simulacionReservasEntradasEventos_modelo.Usuario;

public class ListadoEventos {
	private LinkedList<Eventos> eventos;

	public LinkedList<Eventos> getEventos() {
		return eventos;
	}

	public void setEventos(LinkedList<Eventos> eventos) {
		this.eventos = eventos;
	}

	@Override
	public String toString() {
		return "ListadoEventos [eventos=" + eventos + "]";
	}

	public ListadoEventos(LinkedList<Eventos> eventos) {
		super();
		this.eventos = eventos;
	}

	public void agregarEvento(Eventos evento) throws ReservaException {
		
		if (evento.getFecha_evento().isBefore(LocalDate.now())) {
			throw new ReservaException("Esta fecha es pasada a la del evento");
			
		} else if (this.evento.equals(evento.getNombre())) {
			throw new ReservaException("Hay un evento con el mismo nombre");
			
		} else if (this.evento.equals(evento.getFecha_evento())) {
			throw new ReservaException("Hay un evento la misma fecha");
			
		} else {
			eventos.add(evento);
			
		}
	}

	public Reserva devolverReserva(int id, String nombreEvento, 
			String fecha) {
		
		Eventos evento1 = new Eventos(fecha, LocalDate.now(), "", null);
		for(Eventos e : eventos) {
			if(e.equals(evento1)) {
				return e;
			}
		}
		
	}

	Eventos evento;
	public LinkedList<Eventos> agregarReservaUsuario(Usuario email, Eventos id) 
			throws ReservaException {
		
		if(eventos == null) {
			throw new ReservaException("El evento no existe");
			
		}else if(eventos.contains(email) && eventos.contains(id)) {
			
			
		}
		return eventos;
		
	}
}
