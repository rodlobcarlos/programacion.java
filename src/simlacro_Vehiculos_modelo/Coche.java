package simlacro_Vehiculos_modelo;

import java.time.LocalDate;

public class Coche extends Vehiculo_combustible implements Alquilable{

	public Coche(int id, Alquiler[] alquileres, boolean disponible_alquilado) {
		super(id, alquileres, disponible_alquilado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrecioPorDia() {
		int precioBase = 40;
		return precioBase;
	}

	@Override
	public boolean estaAlquilado(LocalDate fecha) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
