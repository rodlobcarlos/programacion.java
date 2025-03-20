package simlacroInterfaces;

import java.time.LocalDate;
import java.util.Objects;

public class Alquiler {
	private int id;
	private Vehiculo datos;
	private int num_permiso_conducir;
	private String dni;
	private LocalDate fecha_entrega;
	private LocalDate fecha_registro_alquiler;
	private int dias;
	private EstadoAlquiler estado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Vehiculo getDatos() {
		return datos;
	}
	public void setDatos(Vehiculo datos) {
		this.datos = datos;
	}
	public int getNum_permiso_conducir() {
		return num_permiso_conducir;
	}
	public void setNum_permiso_conducir(int num_permiso_conducir) {
		this.num_permiso_conducir = num_permiso_conducir;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public LocalDate getFecha_entrega() {
		return fecha_entrega;
	}
	public void setFecha_entrega(LocalDate fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}
	public LocalDate getFecha_registro_alquiler() {
		return fecha_registro_alquiler;
	}
	public void setFecha_registro_alquiler(LocalDate fecha_registro_alquiler) {
		this.fecha_registro_alquiler = fecha_registro_alquiler;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public EstadoAlquiler getEstado() {
		return estado;
	}
	public void setEstado(EstadoAlquiler estado) {
		this.estado = estado;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(datos, fecha_registro_alquiler);
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
		return Objects.equals(datos, other.datos)
				&& Objects.equals(fecha_registro_alquiler, other.fecha_registro_alquiler);
	}
	
	float getImporteGeneradoPorAlquilar() {
		return 0;
	}
}
