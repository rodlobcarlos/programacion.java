package orientacionObjetos;

public class Entrenador_hrn {
	private String idFederacion;
	private float salario;

	protected String getIdFederacion() {
		return idFederacion;
	}

	protected void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}

	protected float getSalario() {
		System.out.println("get salario del persona");
		return salario;
	}

	protected void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Entrenador_hrn [idFederacion=" + idFederacion + ", salario=" + salario + ", toString()="
				+ super.toString() + "]";
	}

	public Entrenador_hrn() {
		super();
	}

	public Entrenador_hrn(String idFederacion) {
		super();
		this.idFederacion = idFederacion;
	}

	public Entrenador_hrn(String idFederacion, float salario) {
		super();
		this.idFederacion = "ESP";
	}

	public void concentrarse() {
		// TODO Auto-generated method stub
		
	}
	
	
}
