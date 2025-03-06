package modelo;

import java.time.LocalDate;

public class CamaraSeguridad extends DispositivosWifi{
	
	public CamaraSeguridad(int id, String mac, EstadoWifi estadoW, LocalDate fechaActualizacion) {
		super(id, mac, estadoW, fechaActualizacion);
	}

	@Override
	public String toString() {
		return "CamaraSeguridad [pendienteActualización()=" + pendienteActualización() + ", getId()=" + getId()
				+ ", getMac()=" + getMac() + ", getEstadoW()=" + getEstadoW() + ", getFechaActualizacion()="
				+ getFechaActualizacion() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";
	}

	@Override
	void conectarInternet() {
		System.out.println("Se conecta mediante WPA3");
		
	}

	@Override
	boolean pendienteActualización() {
		boolean seActualiza = false;
		if(getFechaActualizacion().equals(LocalDate.now().plusWeeks(2))){
			seActualiza = true;
		}
		return seActualiza;
	}

	@Override
	void apagar() {
		// TODO Auto-generated method stub
		
	}
	
}
