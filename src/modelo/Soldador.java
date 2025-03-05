package modelo;

public class Soldador extends Robots {
	private float temperatura;
	private String espesificacion_seguridad;
	
	public float getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	public String getEspesificacion_seguridad() {
		return espesificacion_seguridad;
	}
	public void setEspesificacion_seguridad(String espesificacion_seguridad) {
		this.espesificacion_seguridad = espesificacion_seguridad;
	}
	
	public Soldador(int iD, String modelo, int bateria, Estado estado, String combustible, String descripcion,
			int contador, String nombre, float temperatura, String espesificacion_seguridad) {
		super(iD, modelo, bateria, estado, combustible, descripcion, nombre);
		this.temperatura = temperatura;
		this.espesificacion_seguridad = espesificacion_seguridad;
	}
	
	@Override
	public String toString() {
		return "Soldador [temperatura=" + temperatura + ", espesificacion_seguridad=" + espesificacion_seguridad + "]";
	}
	
	/*@Override
	String ejecutarTarea() {
		return;
		
	}*/
	/*@Override
	boolean recargar() {
		return;	
	}*/
	
	
}
