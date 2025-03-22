package simlacro_Vehiculos_modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Alquiler implements Alquilable{
	private int id;
	private Vehiculo_combustible datos;
	private int num_permiso_conductor;
	private String DNI;
	private LocalDate fecha_entrega_inicio;
	private LocalDate fecha_registro;
	private int num_dias;
	private EstadoAlquiler estado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Vehiculo_combustible getDatos() {
		return datos;
	}
	public void setDatos(Vehiculo_combustible datos) {
		this.datos = datos;
	}
	public int getNum_permiso_conductor() {
		return num_permiso_conductor;
	}
	public void setNum_permiso_conductor(int num_permiso_conductor) {
		this.num_permiso_conductor = num_permiso_conductor;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public LocalDate getFecha_entrega_inicio() {
		return fecha_entrega_inicio;
	}
	public void setFecha_entrega_inicio(LocalDate fecha_entrega_inicio) {
		this.fecha_entrega_inicio = fecha_entrega_inicio;
	}
	public LocalDate getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(LocalDate fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public int getNum_dias() {
		return num_dias;
	}
	public void setNum_dias(int num_dias) {
		this.num_dias = num_dias;
	}
	public EstadoAlquiler getEstado() {
		return estado;
	}
	public void setEstado(EstadoAlquiler estado) {
		this.estado = estado;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(datos, fecha_registro);
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
		return Objects.equals(datos, other.datos) && Objects.equals(fecha_registro, other.fecha_registro);
	}
	
	@Override
	public String toString() {
		return "Alquiler [id=" + id + ", datos=" + datos + ", num_permiso_conductor=" + num_permiso_conductor + ", DNI="
				+ DNI + ", fecha_entrega_inicio=" + fecha_entrega_inicio + ", fecha_registro=" + fecha_registro
				+ ", num_dias=" + num_dias + "]";
	}
	
	public Alquiler(int id, Vehiculo_combustible datos, int num_permiso_conductor, String dNI,
			LocalDate fecha_entrega_inicio, LocalDate fecha_registro, int num_dias, EstadoAlquiler estado) {
		super();
		this.id = id;
		this.datos = datos;
		this.num_permiso_conductor = num_permiso_conductor;
		DNI = dNI;
		this.fecha_entrega_inicio = fecha_entrega_inicio;
		this.fecha_registro = fecha_registro;
		this.num_dias = num_dias;
		this.estado = estado;
	}
	
	double getImporteGeneradoPorAlquiler() {
		return 0;
	}
	@Override
	public boolean estaAlquilado(LocalDate fecha) {
		fecha = LocalDate.now();
		boolean alquilado = false;
		if(this.estado.equals(EstadoAlquiler.ENTREGADO) || this.estado.equals(EstadoAlquiler.CERRADO)) {
			alquilado = true;
			System.out.println(fecha);
		}
		return alquilado;
	}
	
	int precioBase;
	int dia;
	Patinete p;
	@Override
	public double getPrecioPorDia() {
		if(p.equals(p) && dia == 1) {
			precioBase = 50;
		}else {
			precioBase = 50 * (dia + 29); 
		}
		return precioBase;
	}
	
	
}
