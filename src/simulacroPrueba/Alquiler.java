package simulacroPrueba;

import java.time.LocalDate;
import java.util.Objects;

public class Alquiler implements IAalquilable{
	private int id;
	private VehiculoGeneral datos;
	private String carnet;
	private String dni;
	private int numDias;
	private EstadoCoche estado;
	private float precio_base;
	
	public float getPrecio_base() {
		return precio_base;
	}
	public void setPrecio_base(float precio_base, String v) {
		this.precio_base = precio_base;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public VehiculoGeneral getDatos() {
		return datos;
	}
	public void setDatos(VehiculoGeneral datos) {
		this.datos = datos;
	}
	public String getCarnet() {
		return carnet;
	}
	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getNumDias() {
		return numDias;
	}
	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}
	public EstadoCoche getEstado() {
		return estado;
	}
	public void setEstado(EstadoCoche estado) {
		this.estado = estado;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(datos);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alquiler other = (Alquiler) obj;
		return Objects.equals(datos, other.datos);
	}
	
	public Alquiler(int id, VehiculoGeneral datos, String carnet, String dni, int numDias, EstadoCoche estado,
			float precio_base) {
		super();
		this.id = id;
		this.datos = datos;
		this.carnet = carnet;
		this.dni = dni;
		this.numDias = numDias;
		this.estado = estado;
		this.precio_base = precio_base;
	}
	
	boolean alquilado;
	@Override
	public boolean estaAlquilado() {
		if(estaAlquilado()) {
			alquilado = true;
			LocalDate.now();
		}else {
			alquilado = false;
		}
		return false;
	}

	int precioBase;
	@Override
	public double getPrecioDia() {
		if(this.datos instanceof Furgoneta) {
			precioBase = 45;
			float añadido = (float) ((precioBase + ((Furgoneta) datos).getPma() * 0.05) * numDias);
		}else if(this.datos instanceof Coche) {
			precioBase = 40;
		}else if (this.datos instanceof Patinete) {
			precioBase = 50;
			// POR TERMINAR
		}
		return precioBase;
	}
}
