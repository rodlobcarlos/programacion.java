package boletin_3;

public class datosClimatologicos {
	private int agua_recogida;
	private float temp_max;
	private float temp_min;
	private boolean llueve;

	public int getAgua_recogida() {
		return agua_recogida;
	}

	public void setAgua_recogida(int agua_recogida) {
		this.agua_recogida = agua_recogida;
	}

	public float getTemp_max() {
		return temp_max;
	}

	public void setTemp_max(int temp_max) {
		this.temp_max = temp_max;
	}

	public float getTemp_min() {
		return temp_min;
	}

	public void setTemp_min(float temp_min) {
		this.temp_min = temp_min;
	}

	public boolean isLlueve() {
		return llueve;
	}

	public void setLlueve(boolean llueve) {
		this.llueve = llueve;
	}

	public datosClimatologicos(int agua_recogida, int temp_max, int temp_min, boolean llueve) {
		super();
		this.agua_recogida = agua_recogida;
		this.temp_max = temp_max;
		this.temp_min = temp_min;
		this.llueve = llueve;
	}
	
	@Override
	public String toString() {
		return "datosClimatologicos [agua_recogida=" + agua_recogida + ", temp_max=" + temp_max + ", temp_min="
				+ temp_min + ", llueve=" + llueve + "]";
	}

	void riesgoNieve(boolean llueve) {
		if (llueve && temp_min < -5) {
			System.out.println("Hay riesgo de nieve.");
		} else {
			llueve = false;
			System.out.println("No hay riesgo de nieve.");
		}
	}

	private boolean validar(int temp_max, int temp_min) {
		boolean cierto = false;
		if(temp_max == 0 && temp_min == 0) {
			cierto = true;
		}
		return cierto;
	}
	void alertarPosibleErrorEnTomaDatos(boolean cierto) {
		if (cierto) {
			System.out.println("Revisar el sistema de recogida de datos");
		}
	}
	
	public float mediaTemperatura(float temp_max, float temp_min) {
		float media = temp_max + temp_min;
		return media;
	}
}
