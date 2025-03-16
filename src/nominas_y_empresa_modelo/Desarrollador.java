package nominas_y_empresa_modelo;

public class Desarrollador extends AEmpleado implements INomina {
	private int lenguajes;
	private int frameworks;

	public int getLenguajes() {
		return lenguajes;
	}

	public void setLenguajes(int lenguajes) {
		this.lenguajes = lenguajes;
	}

	public int getFrameworks() {
		return frameworks;
	}

	public void setFrameworks(int frameworks) {
		this.frameworks = frameworks;
	}

	@Override
	public String toString() {
		return "Desarrollador [lenguajes=" + lenguajes + ", frameworks=" + frameworks + "]";
	}

	public Desarrollador(String nombre, int id, String apellidos, float salario, boolean tieneReduccionHoraria,
			Categoria categ, int lenguajes, int frameworks) {
		super(nombre, id, apellidos, salario, tieneReduccionHoraria, categ);
		this.lenguajes = lenguajes;
		this.frameworks = frameworks;
	}

	@Override
	public String devuleveFunciones() {
		return "Desarrollador: Codificar, deseñar planes de pruebas y ejecutarlo";
	}

	@Override
	public void imprimeHorario() {
		if (isTieneReduccionHoraria()) {
			System.out.println("Horario: 8:00 -> 14:00 y 16:00 -> 20:00");
		} else {
			System.out.println("Horario: 8:00 -> 16:00 y 16:00 -> 00:00");
		}
	}

	double calculo;

	@Override
	public double calculaImporteNomina() {
		if (getCateg().equals(Categoria.DESARROLLADOR_SENIOR) || getCateg().equals(Categoria.DESARROLLADOR_JUNIOR)) {
			calculo = getSalario() + (lenguajes * 0.01 + frameworks * 0.3);
		} else {
			System.out.println("No es desarrollador");
		}
		return calculo;
	}
}
