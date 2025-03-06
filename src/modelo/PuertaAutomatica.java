package modelo;

import java.time.LocalDate;

public class PuertaAutomatica extends DispositivosWifi{
	
	public PuertaAutomatica(int id, String mac, EstadoWifi estadoW, LocalDate fechaActualizacion) {
		super(id, mac, estadoW, fechaActualizacion);
	}

	
	@Override
	public String toString() {
		return "PuertaAutomatica [pendienteActualización()=" + pendienteActualización() + ", getId()=" + getId()
				+ ", getMac()=" + getMac() + ", getEstadoW()=" + getEstadoW() + ", getFechaActualizacion()="
				+ getFechaActualizacion() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";
	}


	@Override
	void conectarInternet() {
		System.out.println("Se conecta mediante WPA2");
		
	}

	@Override
	boolean pendienteActualización() {
		boolean seActualiza = false;
		if(getFechaActualizacion().equals(LocalDate.now().plusMonths(12))) {
			seActualiza = true;
		}
		return seActualiza;
	}

	@Override
	void apagar() {
		// TODO Auto-generated method stub
		
	}
	
}
