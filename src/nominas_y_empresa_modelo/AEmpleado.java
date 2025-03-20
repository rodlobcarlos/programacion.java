package nominas_y_empresa_modelo;

import java.util.Objects;

// Clase empleado
public abstract class AEmpleado {
	private String nombre;
	private int id;
	private String Apellidos;
	private float salario;
	private boolean tieneReduccionHoraria;
	private Categoria categ;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public boolean isTieneReduccionHoraria() {
		return tieneReduccionHoraria;
	}

	public void setTieneReduccionHoraria(boolean tieneReduccionHoraria) {
		this.tieneReduccionHoraria = tieneReduccionHoraria;
	}

	public Categoria getCateg() {
		return categ;
	}

	public void setCateg(Categoria categ) {
		this.categ = categ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AEmpleado other = (AEmpleado) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "AEmpleado [nombre=" + nombre + ", id=" + id + ", Apellidos=" + Apellidos + ", salario=" + salario
				+ ", tieneReduccionHoraria=" + tieneReduccionHoraria + "]";
	}

	public AEmpleado(String nombre, int id, String apellidos, float salario, boolean tieneReduccionHoraria,
			Categoria categ) {
		super();
		this.nombre = nombre;
		this.id = id;
		Apellidos = apellidos;
		this.salario = salario;
		this.tieneReduccionHoraria = tieneReduccionHoraria;
		this.categ = categ;
	}

	AEmpleado empleado() {
		return null;
	}

	public abstract String devuleveFunciones();

	public abstract void imprimeHorario();

}

// Clase Proyecto
/*public class Proyecto { private String id; private String descripcion;
 * private LocalDate fecha_inicio; private int numero_mes_duracion; private
 * double presupuesto; }
 */
