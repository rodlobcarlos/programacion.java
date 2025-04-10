package simulacion_VehiculosTraficoRematri_modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class RegistroTrafico {
	private HashMap<Rematriculacion, Vehiculo> vehiculos;

	public HashMap<Rematriculacion, Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(HashMap<Rematriculacion, Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	@Override
	public String toString() {
		return "RegistroTrafico [vehiculos=" + vehiculos + "]";
	}

	public RegistroTrafico(HashMap<Rematriculacion, Vehiculo> vehiculos) {
		super();
		this.vehiculos = new HashMap<Rematriculacion, Vehiculo>(); // (vehiculos)
	}

	public boolean agregarVehiculo(Rematriculacion r, Vehiculo v) {
		boolean registrado = false;
		if (v.equals(v)) {
			System.out.println("Este vehiculo ya está en la lista");
		} else {
			vehiculos.put(r, v);
			registrado = true;
		}
		return registrado;
	}

	RegistroTrafico l;

	public boolean registrarRematriculacion(Rematriculacion r) {
		boolean rematriculado = false;
		if (vehiculos.containsKey(r.getNum_bastidor()) && vehiculos.containsKey(r.getMatricula_final())
				&& vehiculos.containsKey(r.getFecha_matriculacion())) {
			rematriculado = true;
		} else {
			l.agregarVehiculo(null, null);
		}
		return rematriculado;
	}

	public boolean buscarVehiculoBasti(HashMap<String, Vehiculo> m) {
		boolean encontrado = false;
		for (Vehiculo n : m.values()) {
			if(m.containsKey(n)) {
				if(n.getNum_bastidor() != null) {
					encontrado = true; 
				}
			}
		}
		return encontrado;
	}
	
	public List<Vehiculo> vehiculosPropietario(String propietario) {
		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		for(Vehiculo v: (vehiculos.) {
			if(v.getPropietario_actual().equals(propietario)) {
				vehiculos.add(v);
			}
		}
		Collections.sort(vehiculos);
		return vehiculos;
		
	}

	public void mostrarVehiculosAñoMatric(Vehiculo v, Rematriculacion fecha) {
		Map<Rematriculacion, Vehiculo> entrada = new HashMap<>();
		Set<Map.Entry<Rematriculacion, Vehiculo>> entradas = entrada.entrySet();
		Entry<Rematriculacion, Vehiculo> elemento;
		Iterator it = entradas.iterator();

		while (it.hasNext()) {
			elemento = (Entry<Rematriculacion, Vehiculo>) it.next();
			if(elemento.getValue().getAño_fabricacion() != null) {
				System.out.println(elemento);
			}
		}
	}

	Rematriculacion r;
	public void mostrarRematriculacionVehiculo(Vehiculo v) {
		Map<Rematriculacion, Vehiculo> entrada = new HashMap<>();
		Set<Map.Entry<Rematriculacion, Vehiculo>> entradas = entrada.entrySet();
		Entry<Rematriculacion, Vehiculo> elemento;
		Iterator it = entradas.iterator();

		while (it.hasNext()) {
			elemento = (Entry<Rematriculacion, Vehiculo>) it.next();
			if (elemento.getValue().toString() != null) {
				System.out.println(elemento);
			}
		}
	}
}