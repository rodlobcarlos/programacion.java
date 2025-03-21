package simulacroVuelo_modelo;

import java.util.Date;

public class Piloto_comercial extends Pilotos{

	public Piloto_comercial(String nombre, String nacionalidad, int edad, int num_licencia, int total_horas_vuelo,
			String vuelos_asignados) {
		super(nombre, nacionalidad, edad, num_licencia, total_horas_vuelo, vuelos_asignados, lista_vuelos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operarVuelo() {
		System.out.println("Opera vuelos de hasta 8 horas");		
	}

	@Override
	public int getDuracionVuelo(Date vuelo) {
		
		return 0;
	}

	@Override
	int contarVuelos() {
		for(int i = 0; i < )
		return 0;
	}

	@Override
	void agregarVuelo() {
		// TODO Auto-generated method stub
		
	}

}
