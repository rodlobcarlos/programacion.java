package modelo;

import java.time.LocalDate;

public class SensoresTemperatura extends DispositivosWifi{
	
	public SensoresTemperatura(int id, String mac, EstadoWifi estadoW, LocalDate fechaActualizacion) {
		super(id, mac, estadoW, fechaActualizacion);
	}

	private float temperatura;
	
	public float getTemperatura() {
		return temperatura;
	}

	@Override
	public String toString() {
		return "SensoresTemperatura [temperatura=" + temperatura + ", getTemperatura()=" + getTemperatura()
				+ ", pendienteActualización()=" + pendienteActualización() + ", getId()=" + getId() + ", getMac()="
				+ getMac() + ", getEstadoW()=" + getEstadoW() + ", getFechaActualizacion()=" + getFechaActualizacion()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ "]";
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	void conectarInternet() {
		System.out.println("Se conecta mediante WPA");
	}

	@Override
	boolean pendienteActualización() {
		boolean seActualiza = false;
		if (getFechaActualizacion().equals(LocalDate.now().plusMonths(3))) {
			seActualiza = true;
		}
		return seActualiza;
	}

	@Override
	void apagar() {
		// TODO Auto-generated method stub
		
	}
	
}
