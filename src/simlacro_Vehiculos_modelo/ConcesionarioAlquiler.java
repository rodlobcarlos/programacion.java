package simlacro_Vehiculos_modelo;

import java.util.Arrays;

public class ConcesionarioAlquiler {
	private Vehiculo_general[] vehiculos;
	private String nombre;
	private String direccion;

	public Vehiculo_general[] getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(Vehiculo_general[] vehiculos) {
		this.vehiculos = vehiculos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "ConcesionarioAlquiler [vehiculos=" + Arrays.toString(vehiculos) + ", nombre=" + nombre + ", direccion="
				+ direccion + "]";
	}

	public ConcesionarioAlquiler(Vehiculo_general[] vehiculos, String nombre, String direccion) {
		super();
		this.vehiculos = vehiculos;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	void agregarVehiculo(Vehiculo_general v) {
		if (v instanceof Vehiculo_combustible) {
			Vehiculo_combustible veComb = (Vehiculo_combustible) v;
			for (Vehiculo_general vehiculo : vehiculos) {
				if (v instanceof Vehiculo_combustible
						&& ((Vehiculo_combustible) v).getMatricula().equals(veComb.getMatricula())) {
					System.out.println("Este vehiculo ya esta añadido");
				}
			}
			
		}
	}
}
