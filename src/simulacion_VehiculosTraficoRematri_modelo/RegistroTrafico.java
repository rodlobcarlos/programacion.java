package simulacion_VehiculosTraficoRematri_modelo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class RegistroTrafico {
	private HashMap<String, Vehiculo> vehiculos;

	public HashMap<String, Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(HashMap<String, Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	@Override
	public String toString() {
		return "RegistroTrafico [vehiculos=" + vehiculos + "]";
	}

	public RegistroTrafico(HashMap<String, Vehiculo> vehiculos) {
		super();
		this.vehiculos = new HashMap<String, Vehiculo>(); // (vehiculos)
	}

	public boolean agregarVehiculo(String r, Vehiculo v) {
		boolean registrado = false;
		if (v.equals(v)) {
			System.out.println("Este vehiculo ya está en la lista");
		} else {
			vehiculos.put(r, v);
			registrado = true;
		}
		return registrado;
	}

	public boolean registrarRematriculacion(Rematriculacion r) {
		boolean rematriculado = false;
		if (vehiculos.containsKey(r.getNum_bastidor()) && vehiculos.containsKey(r.getMatricula_final())
				&& vehiculos.containsKey(r.getFecha_matriculacion())) {
			rematriculado = true;
		}
		return rematriculado;
	}

	public boolean buscarVehiculoBasti(Vehiculo v) {
		boolean encontrado = false;
		Map<String, Vehiculo> entrada = new HashMap<>();
		Set<Map.Entry<String, Vehiculo>> entradas = entrada.entrySet();
		Entry<String, Vehiculo> elemento;
		Iterator it = entradas.iterator();

		while (it.hasNext()) {
			elemento = (Entry<String, Vehiculo>) it.next();
			if (vehiculos.containsKey(v.getNum_bastidor())) {
				encontrado = true;
				System.out.println(v.toString());
			}
		}
		return encontrado;
	}

	public HashMap<String, Vehiculo> mostrarVehiculosAñoMatric(Vehiculo v, Rematriculacion fecha) {
		Map<String, Vehiculo> entrada = new HashMap<>();
		Set<Map.Entry<String, Vehiculo>> entradas = entrada.entrySet();
		Entry<String, Vehiculo> elemento;
		Iterator it = entradas.iterator();

		while (it.hasNext()) {
			elemento = (Entry<String, Vehiculo>) it.next();
			if (vehiculos.containsKey(fecha.getFecha_matriculacion())) {
			}
		}
		return vehiculos;
	}

	Rematriculacion r;
	public HashMap<String, Vehiculo> mostrarRematriculacionVehiculo(Vehiculo v) {
		Map<String, Vehiculo> entrada = new HashMap<>();
		Set<Map.Entry<String, Vehiculo>> entradas = entrada.entrySet();
		Entry<String, Vehiculo> elemento;
		Iterator it = entradas.iterator();

		while (it.hasNext()) {
			elemento = (Entry<String, Vehiculo>) it.next();
			if(vehiculos.containsKey(v)) {
				System.out.println(r.toString());
			}
		}
		return vehiculos;
	}
}