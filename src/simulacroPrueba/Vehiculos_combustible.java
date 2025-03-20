package simulacroPrueba;

public abstract class Vehiculos_combustible extends VehiculoGeneral{
	private String matricula;
	private boolean diesel;
	private String modelo;
	private String marca;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean isDiesel() {
		return diesel;
	}

	public void setDiesel(boolean diesel) {
		this.diesel = diesel;
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

	public Vehiculos_combustible(int id, Alquiler[] alquileres, boolean disponible) {
		super(id, alquileres, disponible);
		// TODO Auto-generated constructor stub
	}

	@Override
	float getImporteTotalGenerado() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
