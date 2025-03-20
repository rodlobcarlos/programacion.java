package simlacroInterfaces;

public abstract class VehiculoCombustible extends Vehiculo {
	private String matricula;
	private boolean diesel_o_no;
	private String modelo;
	private String marca;
	private float precio_base;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public boolean isDiesel_o_no() {
		return diesel_o_no;
	}
	public void setDiesel_o_no(boolean diesel_o_no) {
		this.diesel_o_no = diesel_o_no;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPrecio_base() {
		return precio_base;
	}
	public void setPrecio_base(float precio_base) {
		this.precio_base = precio_base;
	}
	
	
}
