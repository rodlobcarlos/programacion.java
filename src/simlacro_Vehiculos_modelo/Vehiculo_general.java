package simlacro_Vehiculos_modelo;

public abstract class Vehiculo_general {
	private int id;
	private Alquiler[] alquileres;
	private boolean disponible_alquilado;

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected Alquiler[] getAlquileres() {
		return alquileres;
	}

	protected void setAlquileres(Alquiler[] alquileres) {
		this.alquileres = alquileres;
	}

	protected boolean isDisponible_alquilado() {
		return disponible_alquilado;
	}

	protected void setDisponible_alquilado(boolean disponible_alquilado) {
		this.disponible_alquilado = disponible_alquilado;
	}

	public Vehiculo_general(int id, Alquiler[] alquileres, boolean disponible_alquilado) {
		super();
		this.id = id;
		this.alquileres = alquileres;
		this.disponible_alquilado = disponible_alquilado;
	}

	@Override
	public String toString() {
		return "Vehiculo_general [id=" + id + ", disponible_alquilado=" + disponible_alquilado + "]";
	}

	double getImporteTotalGenerado() {
		double total = 0;
		for(Alquiler a : alquileres) {
			if(a.getEstado().equals(EstadoAlquiler.ENTREGADO) || a.getEstado().equals(EstadoAlquiler.CERRADO)) {
				total = a.getPrecioPorDia();
			}
		}
		return total;
	}

}
