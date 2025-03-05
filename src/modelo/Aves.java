package modelo;

public abstract class Aves {
	private String pico;
	private String vuela;
	
	public String getPico() {
		return pico;
	}

	public void setPico(String pico) {
		this.pico = pico;
	}

	public String getVuela() {
		return vuela;
	}

	public void setVuela(String vuela) {
		this.vuela = vuela;
	}

	public abstract boolean volar();
}
