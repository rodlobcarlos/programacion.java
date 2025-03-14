package nominas_y_empresa_modelo;

import java.util.Objects;

import modelo.Empleado;

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

	// Clase enum Categoria
	public enum Categoria {
		JEFE_PROYECTO, SCRUM_MASTER, DESARROLLADOR_SENIOR, DESARROLLADOR_JUNIOR, ARQUITECTO
	}

	// Clase INomina
	public interface INomina {
		String nombre_empresa = "Jacaranda S.A";
		String CIF_EMPRESA = "B12345678";

		float calculaImporteNomina();
	}

	// Clase Desarrollador
	public class Desarrollador extends AEmpleado implements INomina{
		private String lenguajes;
		private String frameworks;
		
		public String getLenguajes() {
			return lenguajes;
		}

		public void setLenguajes(String lenguajes) {
			this.lenguajes = lenguajes;
		}

		public String getFrameworks() {
			return frameworks;
		}

		public void setFrameworks(String frameworks) {
			this.frameworks = frameworks;
		}

		@Override
		public String toString() {
			return "Desarrollador [lenguajes=" + lenguajes + ", frameworks=" + frameworks + "]";
		}

		public Desarrollador(String nombre, int id, String apellidos, float salario, boolean tieneReduccionHoraria,
				Categoria categ, String lenguajes, String frameworks) {
			super(nombre, id, apellidos, salario, tieneReduccionHoraria, categ);
			this.lenguajes = lenguajes;
			this.frameworks = frameworks;
		}

		@Override
		public String devuleveFunciones() {
			return "Codificar, deseñar planes de pruebas y ejecutarlo";
		}

		@Override
		public float calculaImporteNomina() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void imprimeHorario() {
			if(isTieneReduccionHoraria()) {
				System.out.println("Horario: 8:00 -> 14:00 y 16:00 -> 20:00");
			}else {
				System.out.println("Horario: 8:00 -> 16:00 y 16:00 -> 00:00");
			}
		}
	}
	
	// Clase Jefe_proyecto
	public class Jefe_proyecto extends AEmpleado implements INomina {

		
		public Jefe_proyecto(String nombre, int id, String apellidos, float salario, boolean tieneReduccionHoraria,
				Categoria categ) {
			super(nombre, id, apellidos, salario, tieneReduccionHoraria, categ);
			// TODO Auto-generated constructor stub
		}

		@Override
		public float calculaImporteNomina() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public String devuleveFunciones() {
			return "Planificar, asegurar la calidad y la entrega de plazos,"
					+ "reporting y elaboración de ofertas";
		}

		@Override
		public void imprimeHorario() {
			if(isTieneReduccionHoraria()) {
				System.out.println("Horario: 8:00 -> 14:00 y 16:00 -> 20:00");
			}else {
				System.out.println("Horario: 8:00 -> 16:00 y 16:00 -> 00:00");
			}
		}
	}
	
	// Clase Proyecto
	/*public class Proyecto {
	 * 	private String id;
	 * 	private String descripcion;
	 * 	private LocalDate fecha_inicio;
	 *	private int numero_mes_duracion;
	 * 	private double presupuesto;
	}*/
}
