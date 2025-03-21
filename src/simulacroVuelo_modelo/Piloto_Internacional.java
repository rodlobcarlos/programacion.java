package simulacroVuelo_modelo;

import java.util.Date;

public class Piloto_Internacional extends Pilotos{

	public Piloto_Internacional(String nombre, String nacionalidad, int edad, int num_licencia, int total_horas_vuelo,
			String vuelos_asignados) {
		super(nombre, nacionalidad, edad, num_licencia, total_horas_vuelo, vuelos_asignados, lista_vuelos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operarVuelo() {
		System.out.println("No tiene límite de horas para la duración de los vuelos");
	}

	@Override
	public int getDuracionVuelo(Date vuelo) {
		
		return 0;
	}

	@Override
	int contarVuelos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void agregarVuelo() {
		// TODO Auto-generated method stub
		
	}
	
}
