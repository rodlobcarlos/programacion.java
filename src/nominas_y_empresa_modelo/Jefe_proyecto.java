package nominas_y_empresa_modelo;

public class Jefe_proyecto extends AEmpleado implements INomina{
	private boolean hablaIngles;
	private int certificaciones;

	public boolean isHablaIngles() {
		return hablaIngles;
	}

	public void setHablaIngles(boolean hablaIngles) {
		this.hablaIngles = hablaIngles;
	}

	public int getCertificaciones() {
		return certificaciones;
	}

	public void setCertificaciones(int certificaciones) {
		this.certificaciones = certificaciones;
	}

	public Jefe_proyecto(String nombre, int id, String apellidos, float salario, boolean tieneReduccionHoraria,
			Categoria categ) {
		super(nombre, id, apellidos, salario, tieneReduccionHoraria, categ);
		// TODO Auto-generated constructor stub
	}

	public Jefe_proyecto(String nombre, int id, String apellidos, float salario, boolean tieneReduccionHoraria,
			Categoria categ, boolean hablaIngles, int certificaciones, float calculo) {
		super(nombre, id, apellidos, salario, tieneReduccionHoraria, categ);
		this.hablaIngles = hablaIngles;
		this.certificaciones = certificaciones;
	}

	@Override
	public String devuleveFunciones() {
		return "Jefe de proyecto: "
				+ "Planificar, asegurar la calidad y la entrega de plazos," + 
				"reporting y elaboración de ofertas";
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
		if (hablaIngles = true) {
			calculo = getSalario() + ((certificaciones * 0.05) + 0.3);
		} else {
			System.out.println("No habla inglés");
		}
		return calculo;
	}
}
