package simulacro_Deportes;

import java.time.LocalDate;
import java.util.Arrays;

public abstract class Deportista implements ICompeticion {
	private String nombre;
	private String pais;
	private int edad;
	private float peso;
	private float altura;
	private Prueba[] pruebas_compite;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public Prueba[] getPruebas_compite() {
		return pruebas_compite;
	}

	public void setPruebas_compite(Prueba[] pruebas_compite) {
		this.pruebas_compite = pruebas_compite;
	}

	@Override
	public String toString() {
		return "Deportista [nombre=" + nombre + ", pais=" + pais + ", edad=" + edad + ", peso=" + peso + ", altura="
				+ altura + ", pruebas_compite=" + Arrays.toString(pruebas_compite) + "]";
	}

	public Deportista(String nombre, String pais, int edad, float peso, float altura) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.pruebas_compite = new Prueba[50];
	}

	abstract int getTiempoCalentamiento();

	abstract int getCaloriasNecesarias();

	int getHorasEntrenamiento() {
		int horas = 0;
		int dias = getProximaPrueba().getFecha().compareTo(LocalDate.now());
		if (dias > 10) {
			horas = 6;
		} else if (dias >= 4 && dias <= 10) {
			horas = 4;
		} else {
			horas = 3;
		}
		return horas;
	}

	Prueba getProximaPrueba() {
		Prueba p = pruebas_compite[0];
		for (int i = 0; i < pruebas_compite.length; i++) {
			if (pruebas_compite[i].equals(EstadoPrueba.PLANIFICADA) && p != null) {
				int diasMininmo = p.getFecha().compareTo(LocalDate.now());
				Prueba itero = pruebas_compite[i];
				int diasItero = itero.getFecha().compareTo(LocalDate.now());
				if (diasMininmo > diasItero) {
					p = itero;
				}
			}
		}
		return p;
	}

	int contarPruebasPorEstado(Prueba prueba) {
		int contador_planificada = 0;
		int contador_enCurso = 0;
		int contador_cerrada = 0;

		if (prueba.getEstado().equals(EstadoPrueba.PLANIFICADA)) {
			contador_planificada++;
			return contador_planificada;
		} else if (prueba.getEstado().equals(EstadoPrueba.EN_CURSO)) {
			contador_enCurso++;
			return contador_enCurso;
		} else {
			contador_cerrada++;
			return contador_cerrada;
		}
	}

	void agragarPrueba(Prueba prueba) throws CompeticionException {
		for(int i = 0; i < pruebas_compite.length; i++) {
			if(pruebas_compite[i] != prueba) {
				if(prueba.getEstado().equals(EstadoPrueba.PLANIFICADA) && prueba.getFecha().isAfter(LocalDate.now())) {
					throw new CompeticionException("No puedes añadir una prueba con fecha pasada");
				}else {
					pruebas_compite[i] = prueba;
				}
			}else {
				throw new CompeticionException("Prueba ya agregada");
			}
		}
	}
}
